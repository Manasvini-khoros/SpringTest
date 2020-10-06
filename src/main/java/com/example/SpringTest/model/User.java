package com.example.SpringTest.model;

public class User {


    private int id;

    private String name;

    private int age;

    private String email;

    private String country;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    @Override

    public String toString() {

        return "User{" +

                "id=" + id +

                ", name='" + name +
                ", age='" + age +
                ", email='" + email +
                ", country='" + country +

                '}';

    }
    }
