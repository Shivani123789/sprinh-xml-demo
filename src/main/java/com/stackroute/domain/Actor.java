package com.stackroute.domain;

public class Actor {
    private String actorname;
    private String gender;
    private int age;

    // create constuctor to use constructor method
    public Actor(String actorname, String gender, int age) {
        this.actorname = actorname;
        this.gender = gender;
        this.age = age;
    }

    public Actor() {
    }

    public String getActorname() {
        return actorname;
    }

    public void setActorname(String actorname) {
        this.actorname = actorname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Actor{" + "name='" + actorname + '\'' + ", gender='" + gender + '\'' + ", age=" + age + '}';
    }
}
