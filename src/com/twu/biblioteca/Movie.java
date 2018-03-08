package com.twu.biblioteca;

public class Movie {
    private String name;
    private String year;
    private String director;
    private String movierating;
    private boolean checkout;

    private  Movie(){
        this.checkout = false;
    }
    public Movie(String name, String year, String director, String movierating){
        this.name = name;
        this.year = year;
        this.director = director;
        this.movierating = movierating;
        this.checkout = false;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getYear(){
        return year;
    }
    public void setYear(String year){
        this.year = year;
    }

    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    public String getMovierating() {
        return movierating;
    }
    public void setMovierating(String movierating) {
        this.movierating = movierating;
    }

    public void setIsCheckedOut(boolean checkOut){
        this.checkout = checkOut;
    }

    public String movieDetails() {
        return String.format(name+ "," + year + "," + director + "," + movierating);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie book = (Movie) o;
        return this.name.equals(book.name) &&
                this.year.equals(book.year)&&
                this.director.equals(book.director);
    }
}
