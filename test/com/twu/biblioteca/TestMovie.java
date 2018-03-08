package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TestMovie {
    @Test
    public void shouldReturnMovieDetails(){
        Movie movie = new Movie("The Shawshank Redemption","1994","Frank Darabont","9.6");
        assertThat(movie.movieDetails(),is(String.format("The Shawshank Redemption,1994,Frank Darabont,9.6")));
    }
}
