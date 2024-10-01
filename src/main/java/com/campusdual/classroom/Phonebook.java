package com.campusdual.classroom;


import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private Map<String, Contact> MapContact;

    public Phonebook() {
        this.MapContact = new HashMap<>();
    }

    public Map<String, Contact> getData() {
        return MapContact;
    }

    public void addContact(Contact contact) {
        MapContact.put(contact.getCode(), contact);
    }

    public void deleteContact(String code) {
        MapContact.remove(code);
    }

    public void showPhonebook() {
        for (Contact contact :  MapContact.values()) {
            System.out.println("Name: " + contact.getName());
            System.out.println("Surnames: " + contact.getSurnames());
            System.out.println("Phone: " + contact.getPhone());
            System.out.println("Code: " + contact.getCode());
            System.out.println();
        }
    }
}
