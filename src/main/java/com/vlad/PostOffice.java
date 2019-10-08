package com.vlad;

import java.util.ArrayList;
import java.util.Arrays;

public class PostOffice implements Cast {
    private ArrayList<Delivery> deliveries;

    public ArrayList<Delivery> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(ArrayList<Delivery> deliveries) {
        this.deliveries = deliveries;
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public void setObservers(ArrayList<Observer> observers) {
        this.observers = observers;
    }

    private ArrayList<Observer> observers;

    PostOffice() {
        deliveries = new ArrayList<>();
        observers = new ArrayList<>();
    }


    public ArrayList<Delivery> getState() {
        return deliveries;
    }

    public void addRecords(Delivery... values) {
        deliveries.addAll(Arrays.asList(values));
        Notify();
    }


    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void Notify() {
        for (int i = 0; i < observers.size(); i++)
            observers.get(i).update(this);
    }
}
