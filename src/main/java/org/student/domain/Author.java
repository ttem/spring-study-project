package org.student.domain;

public class Author {

    private int id;
    private City city;
    private String surname;

    public void setId(int id) {
        this.id = id;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public City getCity() {
        return city;
    }

    public String getSurname() {
        return surname;
    }
}
