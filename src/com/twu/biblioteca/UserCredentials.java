package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class UserCredentials {
    public static ArrayList<Account> listAccount = new ArrayList<Account>();
    private static final UserCredentials list = new UserCredentials();
    private UserCredentials(){
        this.listAccount.add(new Account("111-1111","1110000"));
        this.listAccount.add(new Account("222-2222","2220000"));
        this.listAccount.add(new Account("333-3333","3330000"));
    }
    public static UserCredentials getInstance()
    {
        return list;
    }

    public boolean logIn() {
        System.out.println("please enter your library number:");
        Scanner scanner = new Scanner(System.in);
        String libraryNumber = scanner.nextLine();

        System.out.println("please enter your password:");
        String password = scanner.nextLine();

        if (!listAccount.contains(new Account(libraryNumber,password))) {
            System.out.println("The library number or password is incorrect!");
            return logIn();
        }
        return true;
    }
    public int logIn(String libraryNumber,String password) {
        String lN = libraryNumber;
        String pw = password;
        int flag = listAccount.indexOf(new Account(lN,pw));
        if (flag == -1) {
            System.out.println("The library number or password is incorrect!");
            return flag;
        }
        return flag;
    }

    public UserInformation userInformation(String libraryNumber,String password){
        int index = logIn(libraryNumber,password);
        Account myAccount = listAccount.get(index);
        UserInformation myself = new UserInformation("zzp","2269225970@qq.com","12345678");
        myAccount.setUserInformation(myself);
        //myself.display();
        return myself;
    }
}
