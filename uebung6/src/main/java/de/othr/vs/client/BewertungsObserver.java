package de.othr.vs.client;

import io.grpc.stub.StreamObserver;
import vs.uebung6.Bewertung;

public class BewertungsObserver implements StreamObserver<Bewertung> {

    @Override
    public void onNext(Bewertung bewertung) {
        Client.printResponse(bewertung, "Normaler Stub: ");
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onCompleted() {
        System.out.println("Client: RPC call complete");
    }
}
