package com.vlad;

public class Main {
    public static void main(String[] args) {
//creating post office
        PostOffice postOffice = new PostOffice();
//creating clients
        Client bob = new Client("bob");
        Client jon = new Client("jon");
        Client lol = new Client("lol");
//creating magazines
        Magazine magazine1 = new Magazine("About Animals", 20);
        Magazine magazine2 = new Magazine("About Plants", 30);
//delivery brings new magazines
        Delivery delivery1 = new Delivery(magazine1, bob);
        Delivery delivery2 = new Delivery(magazine2, jon);
        Delivery delivery3 = new Delivery(magazine2, bob);
//adding clients as observers
        postOffice.addObserver(bob);
        postOffice.addObserver(jon);
//informing clients about new magazines
        postOffice.addRecords(delivery1, delivery2, delivery3);
    }

}
