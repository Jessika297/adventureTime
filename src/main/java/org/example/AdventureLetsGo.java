package org.example;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class AdventureLetsGo {

    static boolean end = false;

    public static void main(String[] args) {

        ArrayList<String> AdventureSteps = new ArrayList<String>();

        AdventureSteps.add("Null");
        AdventureSteps.add("Eins");
        AdventureSteps.add("Zwei");
        AdventureSteps.add("Drei");
        AdventureSteps.add("Vier");
        AdventureSteps.add("Fünf");

        while (!end) {

//            Random random = new Random();
//            int randomElement = AdventureSteps.get(random.nextInt(AdventureSteps.size()));
            Collections.shuffle(AdventureSteps);
            String randomElement = AdventureSteps.get(0);

            switch (randomElement) {
                case "Null" -> {
                    System.out.println("step 0");
                    //hier die methode für step 0
                    WegKreuzung();
                    AdventureSteps.remove(0);
                }
                case "Eins" -> {
                    System.out.println("step 1");
                    //hier die methode für step 1
                    AdventureSteps.remove(1);
                }
                case "Zwei" -> {
                    System.out.println("step 2");
                    //hier die methode für step 2
                    AdventureSteps.remove(2); //remove by value not index
                }
                case "Drei" -> {
                    System.out.println("step 3");
                    //hier die methode für step 3
                    AdventureSteps.remove(3);
                }
                case "Vier" -> {
                    System.out.println("step 4");
                    //hier die methode für step 4
                    AdventureSteps.remove(4);
                }
                case "Fünf" -> {
                    System.out.println("step 5");
                    //hier die methode für step 5
                    AdventureSteps.remove(5);
                    end = true;
                }

                default -> System.out.println("i liegt nicht zwischen null und drei");
            }
        }
    }

    static void WegKreuzung() {
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
                } else if (line.contains("dreh um") || line.contains("umdrehen") || line.contains("zurück")) {
                    System.out.println("Du drehst dich um.");
                } else {
                    line = null;
                    System.out.println("Das geht leider nicht. Möchtest du gerade aus gehen, schreibe 'geradeaus'." + System.lineSeparator()
                            + "Möchtest du rechts entlang gehen, schreibe 'rechts rum'." + System.lineSeparator()
                            + "Möchtest du umdrehen, schreibe 'umdrehen'." + System.lineSeparator()
                            + "Wofür entscheidest du dich?");
                }
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Nope");
        }
    }
}