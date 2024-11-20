package de.othr.vs.client;

import de.othr.vs.server.MesswertServer;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import vs.uebung6.Bewertung;
import vs.uebung6.Messwert;
import vs.uebung6.MesswertServiceGrpc;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class Client {

    public static void main(String[] args) throws InterruptedException {

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress(MesswertServer.SERVER_GRPC_HOST,
                        MesswertServer.SERVER_GRPC_PORT)
                .usePlaintext()
                .build();

        // Stub generieren (je nach Anwendungsfall stub, blocking stub oder future stub)
        MesswertServiceGrpc.MesswertServiceBlockingStub blockingStub = MesswertServiceGrpc.newBlockingStub(channel);
        MesswertServiceGrpc.MesswertServiceStub stub = MesswertServiceGrpc.newStub(channel);
        MesswertServiceGrpc.MesswertServiceFutureStub futureStub = MesswertServiceGrpc.newFutureStub(channel);

        // Messages generieren und Service aufrufen
        Messwert messwert = Messwert.newBuilder()
                .setName("Terasse Temperatur")
                .setWert(4.53)
                .build();

        //Möglichkeit 1: Request/Reply mit einem Blocking Stub
        Bewertung response = blockingStub.uploadMessWert(messwert);
        printResponse(response, "Blocking Stub");

        //Möglichkeit 1: Request / Callback mit normalen Stub
        stub.uploadMessWert(messwert, new BewertungsObserver());

        //Möglichkeit 2: Request / Callback mit Stream
        StreamObserver<Messwert> requestObserver = stub.uploadWertePerStream(new BewertungsObserver());

        for (int i = 0; i < 3; i++) {
            Messwert currWert = Messwert.newBuilder()
                    .setName("Per Stream geschickte Temperatur" + i)
                    .setWert(4.53 + i)
                    .build();
            requestObserver.onNext(currWert);
        }
        requestObserver.onCompleted();

        // Client noch nicht beenden, Callbacks vom Server (via StreamObserver::onNext, ...)
        // werden sonst nicht mehr empfangen
        channel.awaitTermination(30L, TimeUnit.SECONDS);
    }

    public static void printResponse(Bewertung response, String stubArt) {
        Date date = new Date(response.getDatum().getSeconds() * 1000);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.GERMANY);
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        String formattedDate = sdf.format(date);
        System.out.printf( stubArt + ": Bewertungsresponse: " + response.getKommando() + " Datum: " + formattedDate + "\n");
    }
}
