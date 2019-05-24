package com.stackroute.domain;

public class Movie {

    public Movie() {
    }
   private Actor actor;
    private int id;
    private String name;
// create constuctor to use constructor method


    public Movie(Actor actor) {
        System.out.println(actor);
        this.actor = actor;
    }


    public Movie(Actor actor, int id, String name) {
        this.actor = actor;
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
