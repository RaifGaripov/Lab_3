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

    public PhoneType getType() {
        return this.type;
    }

    public void setType(PhoneType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.phone + " " + this.type;
    }

    public void setFullPhone(String phone, PhoneType type) {
        this.phone = phone;
        this.type = type;
    }
}