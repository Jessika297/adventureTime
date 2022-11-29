package org.example;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class AdventureLetsGo {

    static boolean end = false;
    static int karma = 0;
    static boolean trollclub = false;
    static boolean nett = true;
    static int waffe = 1;

    public static void main(String[] args) {

        ArrayList<String> AdventureSteps = new ArrayList<>();

        AdventureSteps.add("Null");
        AdventureSteps.add("Eins");
        AdventureSteps.add("Zwei");
        AdventureSteps.add("Drei");
        AdventureSteps.add("Vier");
        AdventureSteps.add("Fünf");

        while (!end) {

            Collections.shuffle(AdventureSteps);
            String randomElement = AdventureSteps.get(0);

            switch (randomElement) {
                case "Null" -> {
                    System.out.println("step 0");
                    WegKreuzung();
                    AdventureSteps.remove("Null");
                }
                case "Eins" -> {
                    System.out.println("step 1");
                    TrollRaetsel();
                    AdventureSteps.remove("Eins");
                }
                case "Zwei" -> {
                    System.out.println("step 2");
                    Huette();
                    AdventureSteps.remove("Zwei"); //remove by value not index
                }
                case "Drei" -> {
                    System.out.println("step 3");
                    Prinzessin();
                    AdventureSteps.remove("Drei");
                }
                case "Vier" -> {
                    System.out.println("step 4");
                    AlterFreund();
                    AdventureSteps.remove("Vier");
                }
                case "Fünf" -> {
                    System.out.println("step 5");
                    Vater();
                    AdventureSteps.remove("Fünf");
                    end = true;
                }

                default -> System.out.println("wrong switch case, bro");
            }
            System.out.println("step Drache");
            Drache();
            end = true;
        }
    }

    static void WegKreuzung() {
        System.out.println("Du stehst in einem Wald. Links geht es nicht weiter. Du kannst aber geradeaus oder rechts lang gehen.");
        System.out.println("Wofür entscheidest du dich?");

        Scanner input = new Scanner(new InputStreamReader(System.in));
        String line = null;

        while (line == null) {
            line = input.nextLine().toLowerCase();

            if (line.contains("geradeaus")) {
                input.close();
                System.out.println("Du gehst geradeaus!");
            } else if (line.contains("rechts")) {
                input.close();
                System.out.println("Du gehst rechts rum.");
            } else if (line.contains("dreh um") || line.contains("umdrehen") || line.contains("zurück")) {
                input.close();
                System.out.println("Du drehst dich um.");
            } else {
                line = null;
                System.out.println("Das geht leider nicht. Möchtest du gerade aus gehen, schreibe 'geradeaus'." + System.lineSeparator()
                        + "Möchtest du rechts entlang gehen, schreibe 'rechts rum'." + System.lineSeparator()
                        + "Möchtest du umdrehen, schreibe 'umdrehen'." + System.lineSeparator()
                        + "Wofür entscheidest du dich?");
            }
        }
    }

    static void TrollRaetsel() {
        System.out.println("Du kommst zu einer Brücke. Ein Troll steht dort.");
        System.out.println("Was kann man nicht sehen aber hören und fühlen.");
        System.out.println("Wähle deine Antwort" + System.lineSeparator()
                + "1. Babys" + System.lineSeparator()
                + "2. Ziegen" + System.lineSeparator()
                + "3. Was soll denn diese scheiß Rätselß Piss dich du Opfer" + System.lineSeparator()
                + "4. Der Wind");
        System.out.println("Wofür entscheidest du dich?");

        Scanner input = new Scanner(new InputStreamReader(System.in));
        String line = null;

        while (line == null) {
            line = input.nextLine().toLowerCase();

            if (line.contains("1") || (line.contains("eins"))) {
                input.close();
                karma += 1;
                System.out.println("Wow bist du dumm, na dann geh mal weiter, mal sehen wie du dich schlägst!");
            } else if (line.contains("2") || (line.contains("zwei"))) {
                input.close();
                karma -= 1;
                System.out.println("Interessante wahl, aber leider falsch.");
            } else if (line.contains("3") || (line.contains("drei"))) {
                input.close();
                karma -= 5;
                System.out.println("Wenn du keine Lust auf Rätsel hast, dann wird dies eine sehr beschwerliche Reise!");
            } else if (line.contains("4") || (line.contains("vier"))) {
                input.close();
                karma += 5;
                System.out.println("Du hast das Rätsel bestanden. Willst du unserem Trollclub beitreten?");
                Scanner trollput = new Scanner(new InputStreamReader(System.in));
                String trollline = null;

                while (trollline == null) {
                    trollline = trollput.nextLine().toLowerCase();

                    if (trollline.contains("ja") || (trollline.contains("yes") || (trollline.contains("1")))) {
                        trollput.close();
                        karma += 1;
                        trollclub = true;
                        System.out.println("Oh man, endlich ein Mitglied in meinem Trollclub! Wir werden so viel spaß haben");
                    } else if (trollline.contains("nein") || (trollline.contains("no")) || (trollline.contains("2"))) {
                        trollput.close();
                        karma -= 1;
                        trollclub = false;
                        System.out.println("Warum will denn niemand dem Trollclub beitreten?");
                    } else {
                        trollline = null;
                        System.out.println("Was soll das heißen?" + System.lineSeparator()
                                + "Möchtest du beitreten, schreibe 'ja'." + System.lineSeparator()
                                + "Möchtest du nicht beitreten, schreibe 'nein'." + System.lineSeparator()
                                + "Wofür entscheidest du dich?");
                    }
                    System.out.println("Na dann mal ab mit dir");
                }
            } else {
                line = null;
                System.out.println("Das geht leider nicht. schreibe die Zahl zur Antwort." + System.lineSeparator()
                        + "1. Babys" + System.lineSeparator()
                        + "2. Ziegen" + System.lineSeparator()
                        + "3. Was soll denn diese scheiß Rätselß Piss dich du Opfer" + System.lineSeparator()
                        + "4. Der Wind");
            }

        }
    }

    static void Huette() {
        System.out.println("Du stehst in einem Wald. Links geht es nicht weiter. Du kannst aber geradeaus oder rechts lang gehen.");
        System.out.println("Wofür entscheidest du dich?");

        Scanner input = new Scanner(new InputStreamReader(System.in));
        String line = null;

        while (line == null) {
            line = input.nextLine().toLowerCase();

            if (line.contains("geradeaus")) {
                input.close();
                System.out.println("Du gehst geradeaus!");
            } else if (line.contains("rechts")) {
                input.close();
                System.out.println("Du gehst rechts rum.");
            } else if (line.contains("dreh um") || line.contains("umdrehen") || line.contains("zurück")) {
                input.close();
                System.out.println("Du drehst dich um.");
            } else {
                line = null;
                System.out.println("Das geht leider nicht. Möchtest du gerade aus gehen, schreibe 'geradeaus'." + System.lineSeparator()
                        + "Möchtest du rechts entlang gehen, schreibe 'rechts rum'." + System.lineSeparator()
                        + "Möchtest du umdrehen, schreibe 'umdrehen'." + System.lineSeparator()
                        + "Wofür entscheidest du dich?");
            }

        }
    }

    static void Prinzessin() {
        System.out.println("Du stehst in einem Wald. Links geht es nicht weiter. Du kannst aber geradeaus oder rechts lang gehen.");
        System.out.println("Wofür entscheidest du dich?");

        Scanner input = new Scanner(new InputStreamReader(System.in));
        String line = null;

        while (line == null) {
            line = input.nextLine().toLowerCase();

            if (line.contains("geradeaus")) {
                input.close();
                System.out.println("Du gehst geradeaus!");
            } else if (line.contains("rechts")) {
                input.close();
                System.out.println("Du gehst rechts rum.");
            } else if (line.contains("dreh um") || line.contains("umdrehen") || line.contains("zurück")) {
                input.close();
                System.out.println("Du drehst dich um.");
            } else {
                line = null;
                System.out.println("Das geht leider nicht. Möchtest du gerade aus gehen, schreibe 'geradeaus'." + System.lineSeparator()
                        + "Möchtest du rechts entlang gehen, schreibe 'rechts rum'." + System.lineSeparator()
                        + "Möchtest du umdrehen, schreibe 'umdrehen'." + System.lineSeparator()
                        + "Wofür entscheidest du dich?");
            }

        }
    }

    static void AlterFreund() {
        System.out.println("Du stehst in einem Wald. Links geht es nicht weiter. Du kannst aber geradeaus oder rechts lang gehen.");
        System.out.println("Wofür entscheidest du dich?");

        Scanner input = new Scanner(new InputStreamReader(System.in));
        String line = null;

        while (line == null) {
            line = input.nextLine().toLowerCase();

            if (line.contains("geradeaus")) {
                input.close();
                System.out.println("Du gehst geradeaus!");
            } else if (line.contains("rechts")) {
                input.close();
                System.out.println("Du gehst rechts rum.");
            } else if (line.contains("dreh um") || line.contains("umdrehen") || line.contains("zurück")) {
                input.close();
                System.out.println("Du drehst dich um.");
            } else {
                line = null;
                System.out.println("Das geht leider nicht. Möchtest du gerade aus gehen, schreibe 'geradeaus'." + System.lineSeparator()
                        + "Möchtest du rechts entlang gehen, schreibe 'rechts rum'." + System.lineSeparator()
                        + "Möchtest du umdrehen, schreibe 'umdrehen'." + System.lineSeparator()
                        + "Wofür entscheidest du dich?");
            }

        }
    }

    static void Vater() {
        System.out.println("Du stehst in einem Wald. Links geht es nicht weiter. Du kannst aber geradeaus oder rechts lang gehen.");
        System.out.println("Wofür entscheidest du dich?");

        Scanner input = new Scanner(new InputStreamReader(System.in));
        String line = null;

        while (line == null) {
            line = input.nextLine().toLowerCase();

            if (line.contains("geradeaus")) {
                input.close();
                System.out.println("Du gehst geradeaus!");
            } else if (line.contains("rechts")) {
                input.close();
                System.out.println("Du gehst rechts rum.");
            } else if (line.contains("dreh um") || line.contains("umdrehen") || line.contains("zurück")) {
                input.close();
                System.out.println("Du drehst dich um.");
            } else {
                line = null;
                System.out.println("Das geht leider nicht. Möchtest du gerade aus gehen, schreibe 'geradeaus'." + System.lineSeparator()
                        + "Möchtest du rechts entlang gehen, schreibe 'rechts rum'." + System.lineSeparator()
                        + "Möchtest du umdrehen, schreibe 'umdrehen'." + System.lineSeparator()
                        + "Wofür entscheidest du dich?");
            }

        }
    }


    static void Drache() {
        System.out.println("Großer böser Drache neben der Prinzessin");
        System.out.println("Möchtest du die Prinzessin warnen?");

        Scanner input = new Scanner(new InputStreamReader(System.in));
        String line = null;

        while (line == null) {
            line = input.nextLine().toLowerCase();

            if (line.contains("ja") || line.contains("yes") || line.contains("1")) {
                input.close();
                karma += 1;
                System.out.println(nett
                        ? "Du warnst die Prinzessin und sie kann ein stück vom Drachen entkommen"
                        : "Die Prinzessin bemerkt dich und macht einen Schritt von dir weg. Sie tritt dem Drachen auf den Fuß und dieser frisst sie");
            } else if (line.contains("nein") || line.contains("no") || line.contains("2")) {
                input.close();
                karma -= 5;
                System.out.println("Die Prinzessin bemerkt dich nicht, aber leider auch nicht den Drachen");
            } else {
                line = null;
                System.out.println("Das geht leider nicht. Möchtest du die Prinzessin warnen, schreibe 'ja'." + System.lineSeparator()
                        + "Möchtest du sie nicht warenn, schreibe 'nein'." + System.lineSeparator()
                        + "Wofür entscheidest du dich?");
            }
        }

        System.out.println("Großer böser Drache sieht wütend aus");
        if (waffe == 1) {
            System.out.println("Möchtest du deinen Bogen zum Angriff nutzen?");
        } else if (waffe == 2) {
            System.out.println("Möchtest du deine Axt zum Angriff nutzen?");
        } else {
            System.out.println("Möchtest du den Drachen Angreifen?");
        }

        Scanner drachput = new Scanner(new InputStreamReader(System.in));
        String drachline = null;

        while (drachline == null) {
            drachline = drachput.nextLine().toLowerCase();

            if (drachline.contains("ja") || drachline.contains("yes") || drachline.contains("1")) {
                drachput.close();
                karma += 1;
                System.out.println(karma > 10
                        ? "Du erschlägst den Drachen"
                        : "Der Drache frisst dich");
            } else if (drachline.contains("nein") || drachline.contains("no") || drachline.contains("2")) {
                drachput.close();
                karma -= 1;
                System.out.println("Der Drache schlägt nach dir.");
                System.out.println(karma < 0 ? "Du kannst ausweichen" : "Du stirbst");
            } else {
                drachline = null;
                System.out.println("Das geht leider nicht. Du möchtest angreifen? Schreibe 'ja'." + System.lineSeparator()
                        + "Möchtest du nicht angreifen, schreibe 'nein'." + System.lineSeparator()
                        + "Wofür entscheidest du dich?");
            }
        }
    }
}