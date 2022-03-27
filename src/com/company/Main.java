package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        //Задание 1
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println(fullName);

        //Задание 2
        String fullNameForReport = fullName.toUpperCase(Locale.ROOT);

        System.out.println("Данные ФИО сотрудника для заполнения отчета: " + fullNameForReport);

        //Задание 3

        String fullNameForReport2 = fullName.replace(" ", "; ");

        System.out.println("Данные ФИО сотрудника для административного отдела: " + fullNameForReport2);

        //Задание 4



        int n = 0;
        String fullNameWithoutYoWithSplitMethod = "";
        String[] words = fullName.split("");


        for (int i = 0; i < fullName.length(); i++) {
            if (words[i].contains("ё")) {
              words[i] = "е";

            }
            fullNameWithoutYoWithSplitMethod = fullNameWithoutYoWithSplitMethod + words[i];
        }

        String fullNameWithoutYo = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullNameWithoutYo); //при помощи метода replace
        System.out.println("Данные ФИО сотрудника - " + fullNameWithoutYoWithSplitMethod); //при помощи метода split и contains
    }
}
