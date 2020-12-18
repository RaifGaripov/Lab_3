package ru.oop.lab3;

public class Name {
    private String first;
    private String second;

    public Name(String name, String surname) {
        this.first = name;
        this.second = surname;
    }

    public String getName() {
        return this.first;
    }

    public void setName(String name) {
        this.first = name;
    }

    public String getSurname() {
        return second;
    }

    public void setSurname(String surname) {
        this.second = surname;
    }

    public String getFullName() {
        String str = this.first;
        if(!this.second.isEmpty())
            str += " " + this.second;
        return str;
    }

    public void setFullName(String name, String surname) {
        this.first = name;
        this.second = surname;
    }
}