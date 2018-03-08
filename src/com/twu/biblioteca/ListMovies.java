package com.twu.biblioteca;
import java.util.ArrayList;

public class ListMovies {
    UserCredentials userCredentials = UserCredentials.getInstance();

    private static ArrayList<Movie> listMovies = new ArrayList<Movie>();
    private static final ListMovies list = new ListMovies();
    private ListMovies(){
        this.listMovies.add(new Movie("The Shawshank Redemption","1994","Frank Darabont","9.6"));
        this.listMovies.add(new Movie("Intouchables","2011","Olivier Nakache","8.5"));
        this.listMovies.add(new Movie("Forrest Gump","1994","Robert Zemeckis","9.4"));
    }
    public static ListMovies getInstance()
    {
        return list;
    }

    public boolean checkoutMovie(Movie movie){
        if( listMovies.contains(movie)){
//            listMovies.get(listMovies.indexOf(movie)).setIsCheckedOut(true);
            System.out.println("exist");
            return true;
        }
        else{
            System.out.println("Not exist");
            return false;
        }
    }

    public String logInCheckOutReturnMovie(String libraryName, String password){
        int index = userCredentials.logIn(libraryName,password);
        if(index > -1){
            UserInformation myself = userCredentials.userInformation(libraryName,password);
            return String.format(myself.getName()+ ","+ myself.getEmail() + "," +myself.getPhoneNum());
        }
        return "LogIn Unsuccessful";
    }

}
