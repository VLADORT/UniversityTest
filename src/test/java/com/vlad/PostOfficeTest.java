package com.vlad;
import org.junit.*;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class PostOfficeTest {

    private static PostOffice postOffice;

    private static Client bob;
    private static Client jon;
    private static Client lol;

    private static Magazine magazine1;
    private static Magazine magazine2;

    @BeforeClass
    public static void init() {
        postOffice = new PostOffice();
        bob = new Client("bob");
        jon = new Client("jon");
        lol = new Client("lol");
        magazine1 = new Magazine("Wash Post", 5);
        magazine2 = new Magazine("BBC", 10);

//        postOffice.addObserver(bob);
//
//        postOffice.addObserver(jon);
//
//        postOffice.addMagazine(magazine1, magazine2);
    }

    @Before
    public void printInfo() {
        System.out.println("Test started");
    }

//    @Ignore
//    @Test
//    public void addMagazine() {
//        postOffice.addRecords(new Delivery(magazine1,bob));
//        postOffice.addRecords(new Delivery(magazine2,jon));
//        assertEquals(postOffice.getDeliveries(), Arrays.asList(new Delivery(magazine1,bob), new Delivery(magazine2,jon)));
//    }

    @Test
    public void addObserver() {
        postOffice.addObserver(jon);
        postOffice.addObserver(lol);
        assertThat(postOffice.getObservers(), containsInAnyOrder(jon, lol));
    }

    @Test
    public void removeObserver() {
        postOffice.removeObserver(jon);
        assertThat(postOffice.getObservers(), not(contains(jon)));
    }

    @Test(expected = Error.class)
    @Ignore
    public void shouldThrowError() {
        throw new StackOverflowError();
    }


}