package org.example;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SimpleTextAdventure {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Du stehst in einem Wald. Links geht es nicht weiter. Du kannst aber geradeaus oder rechts lang gehen.");
        System.out.println("Wofür entscheidest du dich?");

        try (Scanner input = new Scanner(new InputStreamReader(System.in))) {

            String line = null;

            while (line == null) {
                line = input.nextLine();

                if (line.contains("geradeaus")) {
                    System.out.println("Du gehst geradeaus!");
                } else if (line.contains("rechts")) {
                    System.out.println("Du gehst rechts rum.");
                } else if (line.contains("dreh um")) {
                    System.out.println("Du drehst dich um.");
                } else {
                    line = null;
                    System.out.println("Das geht leider nicht. Möchtest du gerade aus gehen, schreibe 'geradeaus'." + System.lineSeparator()
                            + "Möchtest du rechts entlang gehen, schreibe 'rechts'." + System.lineSeparator()
                            + "Möchtest du umdrehen, schreibe 'umdrehen'." + System.lineSeparator()
                            + "Wofür entscheidest du dich?");
                }
            }
        }
    }
}