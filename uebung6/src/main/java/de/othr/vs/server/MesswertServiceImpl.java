package de.othr.vs.server;

import com.google.protobuf.Timestamp;
import io.grpc.stub.StreamObserver;
import vs.uebung6.Bewertung;
import vs.uebung6.Messwert;
import vs.uebung6.MesswertServiceGrpc;

import java.time.Instant;



public class MesswertServiceImpl extends MesswertServiceGrpc.MesswertServiceImplBase {
    @Override
    public void uploadMessWert(Messwert messwert, StreamObserver<Bewertung> responseObserver) {
        double val = messwert.getWert();
        String kommando = val < 15.0 ? val + " es ist kalt" : val + " es ist warm";

        Instant now = Instant.now();
        Timestamp timestamp = Timestamp.newBuilder()
                .setSeconds(now.getEpochSecond())
                .setNanos(now.getNano())
                .build();

        Bewertung bewertung = Bewertung.newBuilder()
                .setKommando(kommando)
                .setDatum(timestamp)
                .build();

        responseObserver.onNext(bewertung);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<Messwert> uploadWertePerStream(StreamObserver<Bewertung> responseObserver) {
        return new StreamObserver<Messwert>() {
            @Override
            public void onNext(Messwert messwert) {
                double val = messwert.getWert();
                String kommando = val < 15.0 ? val + " es ist kalt" : val + " es ist warm";

                Instant now = Instant.now();
                Timestamp timestamp = Timestamp.newBuilder()
                        .setSeconds(now.getEpochSecond())
                        .setNanos(now.getNano())
                        .build();

                Bewertung bewertung = Bewertung.newBuilder()
                        .setKommando(kommando)
                        .setDatum(timestamp)
                        .build();

                responseObserver.onNext(bewertung);
            }

            @Override
            public void onError(Throwable throwable) {
                System.err.println("Fehler beim Empfang: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
                System.out.println("Server: Streaming abgeschlossen.");
            }
        };
    }

}
