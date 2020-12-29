package ru.oop.lab3;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private final ArrayList<Contact> phoneBook;

    public PhoneBook() {
        this.phoneBook = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        this.phoneBook.add(contact);
    }

    public void removeContact(int i) {
        this.phoneBook.remove(i - 1);
    }

    public void removeContact(Contact men) {
        this.phoneBook.remove(men);
    }

    public void changeNameContact(int i, String name) {
        this.phoneBook.get(i - 1).setName(name);
    }

    public void changeSurnameContact(int i, String surname) {
        this.phoneBook.get(i - 1).setSurname(surname);
    }

    public void changePhoneContact(int i, int j, String phone) {
        this.phoneBook.get(i - 1).setPhone(j - 1, phone);
    }

    public void changeTypeContact(int i, int j, PhoneType type) {
        this.phoneBook.get(i - 1).setType(j - 1, type);
    }

    public void changeFullContact(int i, String name, String surname, String phone, PhoneType type) {
        this.phoneBook.get(i - 1).setFullContact(name, surname, phone, type);
    }

    public Contact seeContact(int i) {
        return this.phoneBook.get(i - 1);
    }

    public List<Contact> AllContact() {
        List<Contact> contacts = new ArrayList<>();
        for (Contact contact : this.phoneBook)
            contacts.add(contact);
        return contacts;
    }

    public List<Contact> find(String searchStr) {
        List<Contact> findList = new ArrayList<>();
        for (Contact contact : this.phoneBook)
            if (contact.toString().toLowerCase().contains(searchStr.toLowerCase()))
                findList.add(contact);

        return findList;
    }
}