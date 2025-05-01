package com.example.userInput.model;


public class User {

    private String uName;
    private int uId;
    private int uAge;

    public String getuName() {
        return uName;
    }
    public int getuId() {
        return uId;
    }
    public int getuAge() {
        return uAge;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }
    public void setuId(int uId) {
        this.uId = uId;
    }
    public void setuAge(int uAge) {
        this.uAge = uAge;
    }

    @Override
    public String toString() {
        return "User{" +
                "uName='" + uName + '\'' +
                ", uId=" + uId +
                ", uAge=" + uAge +
                '}';
    }

    public User(String uName, int uId, int uAge) {
        this.uName = uName;
        this.uId = uId;
        this.uAge = uAge;
    }
}
