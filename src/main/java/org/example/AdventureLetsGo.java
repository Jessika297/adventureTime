package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AdventureLetsGo {

    static int karma = 0;
    static boolean trollclub = false;
    static boolean nett = true;
    static boolean liebe = false;
    static boolean vaterBoese = false;
    static boolean prinzessinTreffen = false;
    static int waffe = 1;

    public static void main(String[] args) {

        ArrayList<String> AdventureSteps = new ArrayList<>();

        AdventureSteps.add("Null");
        AdventureSteps.add("Eins");
        AdventureSteps.add("Zwei");
        AdventureSteps.add("Drei");
        AdventureSteps.add("Vier");
        AdventureSteps.add("Fünf");

        while (AdventureSteps.size() > 0) {

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
                }

                default -> System.out.println("wrong switch case, bro");
            }
        }
        System.out.println("step Drache");
        Drache();
    }

    public static String scan() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine().toLowerCase();
    }

    static void WegKreuzung() {
        System.out.println("Du stehst in einem Wald. Links geht es nicht weiter. Du kannst aber geradeaus oder rechts lang gehen.");
        System.out.println("Wofür entscheidest du dich?");

        String line = null;

        while (line == null) {
            line = scan();

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

        String line = null;

        while (line == null) {
            line = scan();

            if (line.contains("1") || (line.contains("eins"))) {
                karma += 1;
                System.out.println("Wow bist du dumm, na dann geh mal weiter, mal sehen wie du dich schlägst!");
            } else if (line.contains("2") || (line.contains("zwei"))) {
                karma -= 1;
                System.out.println("Interessante wahl, aber leider falsch.");
            } else if (line.contains("3") || (line.contains("drei"))) {
                karma -= 5;
                System.out.println("Wenn du keine Lust auf Rätsel hast, dann wird dies eine sehr beschwerliche Reise!");
            } else if (line.contains("4") || (line.contains("vier"))) {
                karma += 5;
                System.out.println("Du hast das Rätsel bestanden. Willst du unserem Trollclub beitreten?");

                String trollline = null;

                while (trollline == null) {
                    trollline = scan();

                    if (trollline.contains("ja") || (line.contains("yes") || (line.contains("1")))) {

                        karma += 1;
                        trollclub = true;
                        System.out.println("Oh man, endlich ein Mitglied in meinem Trollclub! Wir werden so viel spaß haben");
                    } else if (line.contains("nein") || (line.contains("no")) || (line.contains("2"))) {
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
        System.out.println("Du stehst vor einer Hütte. Die Tür steht offen, du könntest hineingehen oder dem Weg um die Hütte folgen");
        System.out.println("Wofür entscheidest du dich?");

        String line = null;

        while (line == null) {
            line = scan();

            if (line.contains("rein")) {
                WaffenWahl();
                System.out.println("Du gehst hinein!");
            } else if (line.contains("herum")) {
                System.out.println("Du gehst herum.");
            } else {
                line = null;
                System.out.println("Das geht leider nicht. Möchtest du hinein gehen, schreibe 'rein'." + System.lineSeparator()
                        + "Möchtest du herum gehen, schreibe 'herum'." + System.lineSeparator()
                        + "Wofür entscheidest du dich?");
            }
        }
    }

    static void WaffenWahl() {
        System.out.println("In der Hütte findest du zwei Waffen" + System.lineSeparator()
                + "1. Bogen" + System.lineSeparator()
                + "2. Axt" + System.lineSeparator()
                + "Du kannst nur höchstens einen Gegenstand mitnehmen.");
        System.out.println("Für welchen Gegenstand entscheidest du dich?");

        String line = null;

        while (line == null) {
            line = scan();

            if (line.contains("1")) {
                waffe = 1;
                System.out.println("Du nimmst den Bogen!");
            } else if (line.contains("2")) {
                waffe = 2;
                System.out.println("Du nimmst die Axt.");
            } else if (line.contains("0")) {
                karma += 2;
                waffe = 3;
                System.out.println("Du entschiedest dich den weg eines Pazifisten zu gehen.");
            } else {
                line = null;
                System.out.println("Das geht leider nicht. Möchtest du den Bogen nehmen, schreibe '1'." + System.lineSeparator()
                        + "Möchtest du die Act nehmen, schreibe '2'." + System.lineSeparator()
                        + "Möchtest du keine Waffe nehmen, schreibe '3'." + System.lineSeparator()
                        + "Wofür entscheidest du dich?");
            }
        }
    }

    static void Prinzessin() {
        prinzessinTreffen = true;
        System.out.println("Du triffst eine wunderschöne Prinzessin." + System.lineSeparator()
                + "Hallo Freund, kannst du mir helfen, mein Kleid hat sich in diesem Ast verfangen");
        System.out.println("Deine Antwort:" + System.lineSeparator()
                + "1. 'Ja natürlich helfe ich dir'" + System.lineSeparator()
                + "2. Das is mir doch egal" + System.lineSeparator()
                + "3. Die Prinzessin beleidigen" + System.lineSeparator()
                + "4. Mit der Prinzessin flirten und sie befreien");

        String line = null;

        while (line == null) {
            line = scan();

            if (line.contains("1")) {
                karma += 1;
                System.out.println("Du befreist die Prinzessin, sie bedankt sich!");
            } else if (line.contains("2")) {
                karma -= 1;
                vaterBoese = true;
                System.out.println("Du gehst einfach weg, was mit der Prinzessin geschieht ist dir egal.");
            } else if (line.contains("3") || line.contains("umdrehen") || line.contains("zurück")) {
                karma -= 5;
                vaterBoese = true;
                System.out.println("Du drehst dich um, die Prinzessin weint, in ihrem Jammer, befreit sie sich selbst und rennt davon.");
            } else if (line.contains("4")) {
                karma += 2;
                liebe = true;
                System.out.println("Die Prinzessin verliebt sich in dich.");
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
        System.out.println("Du triffst einen alten Freund. Du erinnerst dich, dass du ihm noch 3 Gold schuldest.");
        System.out.println("Er fragt dich 'wo ist eigentlich mein Gold mein Freund?'");
        System.out.println("Antwort" + System.lineSeparator()
                + "1. Hier dein Gold" + System.lineSeparator()
                + "2. Hab ich nich" + System.lineSeparator()
                + "3. clevere Ausrede, mit der du versuchst deinen Freund zu verarschen");

        String line = null;

        while (line == null) {
            line = scan();

            if (line.contains("1")) {
                System.out.println("Du gibst deinem Freund das Gold und er bedankt sich");
            } else if (line.contains("2")) {
                System.out.println("Du gehst rechts rumhast das Gold nicht." + System.lineSeparator()
                        + "'Keine Sorge, gib es mir einfach sobald du es hast'");
            } else if (line.contains("3") || line.contains("umdrehen") || line.contains("zurück")) {
                System.out.println("Du versuchst deinen Freund zu verarschen." + System.lineSeparator()
                        + "'Du denkst du spielst Schach, aber du spielst kein Schach Digger. Du spielst Schach gegen dich selber!'");
            } else {
                line = null;
                System.out.println("Das geht leider nicht. Möchtest du das Geld zurück geben, schreibe '1'." + System.lineSeparator()
                        + "Möchtest du rechts kein Geld geben, schreibe '2'." + System.lineSeparator()
                        + "Möchtest du deinen Freund verarschen, schreibe '3'." + System.lineSeparator()
                        + "Wofür entscheidest du dich?");
            }
        }
    }

    static void Vater() {
        System.out.println("Du stehst in einem Dorf. Ein Mann kommt auf dich zu, er sagt");
        if (!vaterBoese && !liebe) {
            System.out.println("Hallo was geht, ich bin hier der Schmied");
            System.out.println(prinzessinTreffen
                    ? "Hier 3 Gold dafür das du meiner Tochter geholfen hast"
                    : "Meine Tochter ist verschwunden, wenn du sie triffst, bitte hilf ihr. Sie ist die aktuelle Miss Velen");
        } else if (vaterBoese && prinzessinTreffen) {
            System.out.println("Du Arschloch hast meiner Tochter nicht geholfen. Verpiss dich");
        } else if (liebe) {
            System.out.println("Ah hallo mein Schwiegersohn, nimm diese 10 Gold");
        } else {
            System.out.println("Ich hab dir nix zu sagen");
        }
    }


    static void Drache() {
        System.out.println("Großer böser Drache neben der Prinzessin");
        System.out.println("Möchtest du die Prinzessin warnen?");

        String line = null;

        while (line == null) {
            line = scan();

            if (line.contains("ja") || line.contains("yes") || line.contains("1")) {
                karma += 1;
                System.out.println(nett
                        ? "Du warnst die Prinzessin und sie kann ein stück vom Drachen entkommen"
                        : "Die Prinzessin bemerkt dich und macht einen Schritt von dir weg. Sie tritt dem Drachen auf den Fuß und dieser frisst sie");
            } else if (line.contains("nein") || line.contains("no") || line.contains("2")) {
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

        String drachline = null;

        while (drachline == null) {
            drachline = scan();

            if (drachline.contains("ja") || drachline.contains("yes") || drachline.contains("1")) {
                karma += 1;
                System.out.println(karma > 10
                        ? "Du erschlägst den Drachen"
                        : "Der Drache frisst dich");
            } else if (drachline.contains("nein") || drachline.contains("no") || drachline.contains("2")) {
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