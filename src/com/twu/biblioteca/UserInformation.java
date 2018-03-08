package com.twu.biblioteca;

public class UserInformation {
    private String name;
    private String email;
    private String phoneNum;

    public UserInformation(){

    }

    public UserInformation(String name, String email,String phoneNum){
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void display(){
        System.out.println(getName());
        System.out.println(getEmail());
        System.out.println(getPhoneNum());
    }
}
