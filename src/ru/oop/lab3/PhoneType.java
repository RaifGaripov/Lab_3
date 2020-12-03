package ru.oop.lab3;

public enum PhoneType {
    MOBILE,
    WORKING,
    HOME;

    public String getType() {
        String str;
        switch (this) {
            case MOBILE:
                str = "Мобильный";
                break;
            case WORKING:
                str = "Рабочий";
                break;
            case HOME:
                str = "Домашний";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + this);
        }
        return str;
    }
}