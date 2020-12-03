package ru.oop.lab3;

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        Contact men1 = new Contact("Иван", "Иванов",
                "+79991234567", PhoneType.MOBILE);
        Contact men2 = new Contact("Вася", "Петров",
                "+79857868955", PhoneType.HOME);
        Contact men3 = new Contact("Парикмахерская", "",
                "+9348732894723", PhoneType.WORKING);
        Contact men4 = new Contact("Олег", "",
                "89121212121", PhoneType.MOBILE);
        Contact men5 = new Contact("Гена", "",
                "+78321122333", PhoneType.WORKING);
        Contact men6 = new Contact("Неизвестный", "",
                "89229273410", PhoneType.HOME);
        Contact men7 = new Contact("Лучше", "Позвонить",
                "88005553535", PhoneType.MOBILE);

        men1.addFullPhone("88129923232", PhoneType.WORKING);

        phoneBook.addContact(men1);
        phoneBook.addContact(men2);
        phoneBook.addContact(men3);
        phoneBook.addContact(men4);
        phoneBook.addContact(men5);
        phoneBook.addContact(men6);
        phoneBook.addContact(men7);

        phoneBook.removeContact(4);
        phoneBook.removeContact(men7);

        phoneBook.changeNameContact(1, "Виктор");
        phoneBook.changePhoneContact(2, 1,"+79224123614");
        phoneBook.changeSurnameContact(3, "Вера");
        phoneBook.changeTypeContact(4, 1, PhoneType.WORKING);
        phoneBook.changeFullContact(5, "Сергей", "Сергеев", "89905377105", PhoneType.HOME);

        System.out.println(phoneBook.seeContact(4));
        System.out.println(phoneBook.seeFullContact(1));
        phoneBook.outputAllContact();

        phoneBook.find("123");
        phoneBook.find("и");
    }
}