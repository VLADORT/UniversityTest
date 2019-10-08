package com.vlad;

public class Delivery {
    private Magazine magazine;
    private Client receiver;

    public Magazine getMagazine() {
        return magazine;
    }

    public void setMagazine(Magazine magazine) {
        this.magazine = magazine;
    }

    public Client getReceiver() {
        return receiver;
    }

    public void setReceiver(Client receiver) {
        this.receiver = receiver;
    }

    public Delivery(Magazine magazine, Client receiver) {
        this.magazine = magazine;
        this.receiver = receiver;
    }
}
