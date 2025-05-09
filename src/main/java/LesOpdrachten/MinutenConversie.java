package LesOpdrachten;

/*
Stefan Kiers
07-05-'25

Schrijf een programma dat input van de user vraagt om jaren, maanden, weken, dagen en uren om te zetten in minuten

 */

import java.util.Scanner;

public class MinutenConversie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Welkom bij de minuten-conversie");
        System.out.print("Wat is het aantal jaar? (Type hier) : ");
        int years = input.nextInt();
        System.out.print("Wat is het aantal maanden? (Type hier) : ");
        int months = input.nextInt();
        System.out.print("Wat is het aantal weken? (Type hier) : ");
        int weeks = input.nextInt();
        System.out.print("Wat is het aantal dagen? (Type hier) : ");
        int days = input.nextInt();
        System.out.print("Wat is het aantal uur? (Type hier) : ");
        int hours = input.nextInt();
        System.out.println();

        int monthsInYear = 12;

        months += (years * monthsInYear);
        weeks = weeks +(months * 4);
        days = days + (weeks * 7);
        hours = hours + (days * 24);
        int minutes = hours*60;

        System.out.println("Het aantal minuten van de opgegeven input is : " + minutes);

    }
}
