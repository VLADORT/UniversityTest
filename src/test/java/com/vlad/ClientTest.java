package com.vlad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClientTest {

    @Test
    void getName() {
        Client client = new Client("abc");
        assertEquals(client.getName(),"abc");
    }
}