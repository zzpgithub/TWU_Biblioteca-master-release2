package com.twu.biblioteca;

public class Account {
    private String libraryNum;
    private String password;
    private UserInformation userInformation = new UserInformation();

    public Account(String libraryNum, String password){
        this.libraryNum = libraryNum;
        this.password = password;
    }

    public String getLibraryNum() {
        return libraryNum;
    }
    public void setLibraryNum(String libraryNum) {
        this.libraryNum = libraryNum;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserInformation(UserInformation userInformation){
        this.userInformation = userInformation;
//        userInformation.setName(userInformation.name);
//        userInformation.setEmail(email);
//        userInformation.setPhoneNum(phoneNum);
//        userInformation.setLibraryNum(this.libraryNum);
    }
    public UserInformation getUserInformation(){
        return userInformation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return this.libraryNum.equals(account.libraryNum) &&
                this.password.equals(account.password);
    }
}
