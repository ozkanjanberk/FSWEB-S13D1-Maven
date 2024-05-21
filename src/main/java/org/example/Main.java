package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        double radius = scanner.nextDouble();
        System.out.println("Enter the width of rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Enter the height of rectangle: ");
        double height = scanner.nextDouble();

    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
       if(clock > 23 || clock < 0 || !isBarking) {
           return false;
       } return clock <8 || clock >=20;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       if(firstAge > 13 && firstAge <= 19 || secondAge > 13 && secondAge <= 19 || thirdAge > 13 && thirdAge <= 19){
           return true;}
       else {return false;}
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int upperLimit = isSummer ? 45:35;
    return temp > 25 && temp<=upperLimit;
    }

    public static double area(double width, double height) {
       if (width<=0 || height<=0){
           return -1;
       }
       return width*height;
    }

    public static double area(double radius) {
       if (radius<0){
           return -1;
       }else {
          return Math.PI * Math.pow(radius, 2);
       }
    }
}
