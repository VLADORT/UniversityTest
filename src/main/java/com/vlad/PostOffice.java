package com.vlad;

import java.util.ArrayList;
import java.util.Arrays;

public class PostOffice implements Cast {
    private ArrayList<Magazine> magazines;

    public ArrayList<Magazine> getMagazines() {
        return magazines;
    }

    public void setMagazines(ArrayList<Magazine> magazines) {
        this.magazines = magazines;
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public void setObservers(ArrayList<Observer> observers) {
        this.observers = observers;
    }

    private ArrayList<Observer> observers;

    PostOffice() {
        magazines = new ArrayList<>();
        observers = new ArrayList<>();
    }


    public ArrayList<Magazine> getState() {
        return magazines;
    }

    public void addMagazine(Magazine... values) {
        magazines.addAll(Arrays.asList(values));
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
