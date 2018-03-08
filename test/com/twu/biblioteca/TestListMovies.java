package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class TestListMovies {
    @Test
    public void shouldReturnCheckedOut(){
        ListMovies list = ListMovies.getInstance();
        Movie movie = new Movie("The Shawshank Redemption","1994","Frank Darabont","9.6");
        assertTrue(list.checkoutMovie(movie));
    }

    @Test
    public void shouldReturnCheckedOutUserInformation(){
        ListMovies list = ListMovies.getInstance();
        list.logInCheckOutReturnMovie("111-1111","1110000");
        assertThat(list.logInCheckOutReturnMovie("111-1111","1110000"),is(String.format("zzp,2269225970@qq.com,12345678")));
    }

}
