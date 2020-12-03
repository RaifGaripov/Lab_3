package ru.oop.lab3;

import java.util.ArrayList;

public class Contact {
    private final Name name;
    private final ArrayList<PhoneNumber> phoneNumbers;

    public Contact(String name, String surname, String phone, PhoneType type) {
        this.name = new Name(name, surname);
        this.phoneNumbers = new ArrayList<>();
        PhoneNumber newPhone = new PhoneNumber(phone, type);
        this.phoneNumbers.add(newPhone);
    }

    public String getName() {
        return this.name.getName();
    }

    public void setName(String name) {
        this.name.setName(name);
    }

    public String getSurname() {
        return this.name.getSurname();
    }

    public void setSurname(String surname) {
        this.name.setSurname(surname);
    }

    public String getFullName() {
        return this.name.getFullName();
    }

    public void setFullName(String name, String surname) {
        this.name.setFullName(name, surname);
    }

    public String getPhone(int i) {
        return this.phoneNumbers.get(i).getPhone();
    }

    public void setPhone(int i, String phone) {
        this.phoneNumbers.get(i).setPhone(phone);
    }

    public String getType(int i) {
        return this.phoneNumbers.get(i).getType();
    }

    public void setType(int i, PhoneType type) {
        this.phoneNumbers.get(i).setType(type);
    }

    public String getFullPhone(int i) {
        return this.phoneNumbers.get(i).getFullPhone();
    }

    public void setFullPhone(int i, String phone, PhoneType type) {
        this.phoneNumbers.get(i).setFullPhone(phone, type);
    }

    public void addFullPhone(String phone, PhoneType type) {
        PhoneNumber newPhone = new PhoneNumber(phone, type);
        this.phoneNumbers.add(newPhone);
    }

    public String getContact() {
        String str = this.name.getFullName() + " ";
        for (PhoneNumber phone : phoneNumbers)
            str += phone.getPhone() + ", ";
        return str.substring(0, str.length() - 2);
    }

    public String getFullContact() {
        String str = this.name.getFullName() + " ";
        for (PhoneNumber phone : phoneNumbers)
            str += phone.getFullPhone() + ", ";
        return str.substring(0, str.length() - 2);
    }

    public void setFullContact(String name, String surname, String phone, PhoneType type) {
        this.name.setFullName(name, surname);
        PhoneNumber newPhone = new PhoneNumber(phone, type);
        this.phoneNumbers.clear();
        this.phoneNumbers.add(newPhone);
    }
}