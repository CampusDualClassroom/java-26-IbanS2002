package com.campusdual.classroom;

import java.util.Scanner;

public class Contact implements ICallActions{
    private String name;
    private String surname;
    private String numberPhone;
    private String code;

    public Contact(String name, String surname, String numberPhone) {

        this.name = name;
        this.surname = surname;
        this.numberPhone = numberPhone;
        this.code=createCode(name,surname);

    }

    @Override
    public void callMyNumber() {
        System.out.println("El contacto " + name + " " + surname + " se está llamando a sí mismo. Su número de teléfono es: " + numberPhone);
    }

    @Override
    public void callOtherNumber(String number) {
        System.out.println("El contacto " + name + " " + surname + " está llamando al número: " + number);
    }

    @Override
    public void showContactDetails() {
        System.out.println("Nombre: " + name);
        System.out.println("Apellido: " + surname);
        System.out.println("Número de teléfono: " + numberPhone);
        System.out.println("Codigo:"+ code);
    }


    private String createCode(String name,String surname){
        //StringBuilder es una clase que permite crear objetos que almmacenan cadenas de caracteres
        //que pueden modificadas sin necesidad de crear nuevos objetos

        StringBuilder stringBuilder = new StringBuilder();
        String primeraLetraEnMinusculas = String.valueOf(name.toLowerCase().charAt(0));
        stringBuilder.append(primeraLetraEnMinusculas);
        String[] apellidos = surname.split(" ");//para que corte cada vez que hay un espacio
        for (int i = 0; i < apellidos.length; i++) {
            if (apellidos.length > 1) {
                if (i == 0) {
                    stringBuilder.append(apellidos[i].toLowerCase().charAt(0));
                } else {
                    stringBuilder.append(apellidos[i].toLowerCase());
                }
            } else {
                stringBuilder.append(apellidos[i].toLowerCase());
            }
        }

        return stringBuilder.toString();
    }

    public String getName() {
        return name;
    }


    public String getSurnames() {
        return surname;
    }

    public CharSequence getPhone() {
        return numberPhone;
    }

    public String getCode() {
        return code;
    }


}
