package org.example;

import java.util.Scanner;

public class WhatToWear {
    public static void main(String[] args) {

        System.out.println("How's the weather today?");
        Scanner reader = new Scanner(System.in);
        String weatherUpdate = reader.nextLine();
        System.out.println("What's the temperature today?");
        int temperatureOfTheDay = reader.nextInt();

            if (weatherUpdate.equals("cloudy") && temperatureOfTheDay < 18) {
            System.out.println("Zipper jacket and trainers");
            if (weatherUpdate.equals("rainy") && temperatureOfTheDay >= 8 && temperatureOfTheDay <= 30) {
                System.out.println("Waterproof jacket and trousers");
            }
            if (weatherUpdate.equals("snowy") && temperatureOfTheDay >= 8) {
                System.out.println("blue polo shirt and boots");
            }
            if (weatherUpdate.equals("sunny") && temperatureOfTheDay >= 18 && temperatureOfTheDay <= 30) {
                System.out.println("polo shirt and slip on trainers");
            }
        }
    }
}