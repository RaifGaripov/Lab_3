package ru.oop.lab3;

public class PhoneNumber {
    private String phone;
    private PhoneType type;

    public PhoneNumber(String phone, PhoneType type) {
        this.phone = phone;
        this.type = type;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getType() {
        return this.type.getType();
    }

    public void setType(PhoneType type) {
        this.type = type;
    }

    public String getFullPhone() {
        return this.phone + " " + this.type.getType();
    }

    public void setFullPhone(String phone, PhoneType type) {
        this.phone = phone;
        this.type = type;
    }
}