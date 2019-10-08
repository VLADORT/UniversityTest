package com.vlad;

import java.util.ArrayList;

public class Client implements Observer {
    String name;

    public Client(String name) {
        this.name = name;
    }

    public void checkMagazine(ArrayList<Delivery> magazines) {
        for (int i = 0; i < magazines.size(); i++) {
            if (name.compareTo(magazines.get(i).getReceiver().getName()) == 0)
                System.out.println(name + ": " + magazines.get(i).getMagazine().getName());
        }
    }

    @Override
    public void update(PostOffice postOffice) {
        checkMagazine(postOffice.getState());
    }

    public String getName() {
        return name;
    }
}
