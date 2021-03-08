package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "str";
        int num = 6;
        
        // Доступ
        String dayOfWeek = "Monday";
        System.out.println(dayOfWeek); // Monday
        
        int number = 10;
        number = 11; // ok
        number = "twelve"; // it does not work!
        
        // Альтернативные способы доступа
        String language = "java", version = "8 or newer";
        
        int age; // declaration
        age = 35; // initialization 
    }
}
