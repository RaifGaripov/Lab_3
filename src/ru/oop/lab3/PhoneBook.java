package ru.oop.lab3;

import java.util.ArrayList;

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

    public String seeContact(int i) {
        return this.phoneBook.get(i - 1).getContact();
    }

    public String seeFullContact(int i) {
        return this.phoneBook.get(i - 1).getFullContact();
    }

    public void outputAllContact()
    {
        System.out.println("Существующие контакты:");
        for(Contact contact : this.phoneBook)
            System.out.format("\t%s\n", contact.getContact());
    }

    public void find(String searchStr) {
        ArrayList<Contact> findList = new ArrayList<>();
        for(Contact contact : this.phoneBook)
            if(contact.getContact().toLowerCase().contains(searchStr.toLowerCase()))
                findList.add(contact);
        System.out.println("Найденные контакты по запросу (" + searchStr +"):");
        for(Contact contact : findList)
            System.out.format("\t%s\n", contact.getContact());
    }
}