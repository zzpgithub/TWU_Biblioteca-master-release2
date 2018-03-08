package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestUserCredentials {
    @Test
    public void shouldReturnSuccessfulLogIn(){
        UserCredentials user = UserCredentials.getInstance();
        assertTrue((user.logIn("111-1111","1110000")) > -1);
    }
}
