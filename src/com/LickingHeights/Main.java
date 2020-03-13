package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
   modulusClock();


    }
    public static void modulusClock(){
        Scanner modulusClock;
        modulusClock = new Scanner(System.in);

    System.out.println("Give me a number of hours");
    int hour = modulusClock.nextInt();

    System.out.println("Enter a value for minutes");
    int minutes = modulusClock.nextInt();

    System.out.println(hour + " : " + minutes);




    }











}











