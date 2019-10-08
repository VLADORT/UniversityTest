package com.vlad;

import junit.framework.AssertionFailedError;
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
        magazine1 = new Magazine("jon", "About Cars");
        magazine2 = new Magazine("bob", "About Animals");
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


    @Test
    public void addMagazine() {
        postOffice.addMagazine(magazine1);
        postOffice.addMagazine(magazine2);
        assertEquals(postOffice.getMagazines(), Arrays.asList(magazine1, magazine2));
    }

    @Test
    public void addObserver() {
        postOffice.addObserver(jon);
        postOffice.addObserver(lol);
        assertThat(postOffice.getObservers(), containsInAnyOrder(jon, lol));
    }

    @Test
    public void removeObserver() {
        postOffice.removeObserver(jon);
        postOffice.removeObserver(lol);
        assertThat(postOffice.getObservers(), hasSize(0));
    }

    @Test(expected = Error.class)
    @Ignore
    public void shouldThrowError() {
        throw new StackOverflowError();
    }


}