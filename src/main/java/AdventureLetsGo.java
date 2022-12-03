import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AdventureLetsGo {

    static int karmaCounter = 0;
    static boolean gnomeClubMember = false;
    static boolean kind = true;
    static boolean princessFellInLove = false;
    static boolean princessFatherHatesYou = false;
    static boolean youMetThePrincess = false;
    static int weapon = 0;

    public static void main(String[] args) {

        ArrayList<String> AdventureSteps = new ArrayList<>();

        AdventureSteps.add("Crossroad");
        AdventureSteps.add("GnomeRiddle");
        AdventureSteps.add("Hut");
        AdventureSteps.add("Princess");
        AdventureSteps.add("OldFriend");
        AdventureSteps.add("Father");

        while (AdventureSteps.size() > 0) {

            Collections.shuffle(AdventureSteps);
            String randomElement = AdventureSteps.get(0);

            switch (randomElement) {
                case "Crossroad" -> {
                    crossroad();
                    AdventureSteps.remove("Crossroad");
                    System.out.println(TextUtil.afterCrossroad);
                }
                case "GnomeRiddle" -> {
                    gnomeRiddle();
                    AdventureSteps.remove("GnomeRiddle");
                    System.out.println(TextUtil.afterGnomeRiddle);
                }
                case "Hut" -> {
                    hut();
                    AdventureSteps.remove("Hut");
                    System.out.println(TextUtil.afterHut);
                }
                case "Princess" -> {
                    princess();
                    AdventureSteps.remove("Princess");
                    System.out.println(TextUtil.afterPrincess);
                }
                case "OldFriend" -> {
                    oldFriend();
                    AdventureSteps.remove("OldFriend");
                    System.out.println(TextUtil.afterOldFriend);
                }
                case "Father" -> {
                    father();
                    AdventureSteps.remove("Father");
                    System.out.println(TextUtil.afterFather);
                }

                default -> System.out.println(TextUtil.afterDefault);
            }
        }
        System.out.println(System.lineSeparator() + TextUtil.beforeDragon);
        dragon();
        System.out.println(TextUtil.afterDragon);
    }

    public static String scan() {
        try (Scanner scan = new Scanner(System.in)) {
            return scan.nextLine().toLowerCase();
        }
    }

    static void crossroad() {
        System.out.println(TextUtil.introCrossroad);
        System.out.println(TextUtil.decision);

        String line = null;

        while (line == null) {
            line = scan();

            if (line.contains("geradeaus") || line.contains("grade") || line.contains("1")) {
                System.out.println("Du gehst geradeaus!");
            } else if (line.contains("rechts") || line.contains("2")) {
                System.out.println("Du gehst rechts rum.");
            } else if (line.contains("dreh um") || line.contains("umdrehen") || line.contains("zurück") || line.contains("3")) {
                System.out.println("Du drehst dich um.");
            } else {
                line = null;
                System.out.println(TextUtil.explanationCrossroad + TextUtil.decision);
            }
        }
    }

    static void gnomeRiddle() {
        System.out.println(TextUtil.introGnomeRiddle);
        System.out.println("Wähle deine Antwort" + System.lineSeparator() + "1. Baby" + System.lineSeparator() + "2. Ziege" + System.lineSeparator() + "3. Was soll denn diese scheiß Rätselß Piss dich du Opfer" + System.lineSeparator() + "4. Der Wind" + "\n");
        System.out.println("Wofür entscheidest du dich?");

        String line = null;

        while (line == null) {
            line = scan();

            if (line.contains("1") || line.contains("eins") || line.contains("baby")) {
                karmaCounter += 1;
                System.out.println("Wow bist du dumm, na dann geh mal weiter, mal sehen wie du dich schlägst!" + "\n");
            } else if (line.contains("2") || line.contains("zwei") || line.contains("ziege")) {
                karmaCounter -= 1;
                System.out.println("Interessante wahl, aber leider falsch.");
            } else if (line.contains("3") || line.contains("drei") || line.contains("piss dich")) {
                karmaCounter -= 5;
                System.out.println("Wenn du keine Lust auf Rätsel hast, dann wird dies eine sehr beschwerliche Reise!" + "\n");
            } else if (line.contains("4") || line.contains("vier") || line.contains("wind")) {
                karmaCounter += 5;
                gnomeClub();
                System.out.println("Na dann mal ab mit dir" + "\n");
            } else {
                line = null;
                System.out.println(TextUtil.explanationGnomeRiddle);
            }

        }
    }

    static void gnomeClub() {
        System.out.println(TextUtil.introGnomeClub);

        String line = null;

        while (line == null) {
            line = scan();

            if (line.contains("ja") || (line.contains("yes") || (line.contains("1")))) {

                karmaCounter += 1;
                gnomeClubMember = true;
                System.out.println("Oh man, endlich ein Mitglied in meinem Trollclub! Wir werden so viel spaß haben" + "\n");
            } else if (line.contains("nein") || (line.contains("no")) || (line.contains("2"))) {
                karmaCounter -= 1;
                gnomeClubMember = false;
                System.out.println("Warum will denn niemand dem Trollclub beitreten?" + "\n");
            } else {
                line = null;
                System.out.println(TextUtil.explanationGnomeClub);
            }
        }
    }

    static void hut() {
        System.out.println(TextUtil.introHut);
        System.out.println(AsciiUtil.asciiHut);
        System.out.println("Wofür entscheidest du dich?" + "\n");

        String line = null;

        while (line == null) {
            line = scan();

            if (line.contains("rein") || line.contains("1") || line.contains("hinein")) {
                System.out.println("Du gehst hinein!" + "\n");
                weaponChoice();
            } else if (line.contains("rum") || line.contains("2")) {
                System.out.println("Du gehst herum." + "\n");
            } else {
                line = null;
                System.out.println(TextUtil.explanationHut);
            }
        }
    }

    static void weaponChoice() {
        System.out.println(TextUtil.introWeaponChoice);
        System.out.println("Für welchen Gegenstand entscheidest du dich?");

        String line = null;

        while (line == null) {
            line = scan();

            if (line.contains("1") || line.contains("bogen")) {
                weapon = 1;
                System.out.println("Du nimmst den Bogen!" + "\n");
            } else if (line.contains("2") || line.contains("axt")) {
                weapon = 2;
                System.out.println("Du nimmst die Axt." + "\n");
            } else if (line.contains("0") || line.contains("3") || line.contains("kein") || line.contains("nicht")) {
                karmaCounter += 2;
                weapon = 3;
                System.out.println("Du entschiedest dich den weg eines Pazifisten zu gehen." + "\n");
            } else {
                line = null;
                System.out.println(TextUtil.explanationWeaponChoice);
            }
        }
    }

    static void princess() {
        youMetThePrincess = true;
        System.out.println(AsciiUtil.asciiPrincess);
        System.out.println(TextUtil.introPrincess);
        System.out.println("Deine Antwort:" + System.lineSeparator() + "1. 'Ja natürlich helfe ich dir'" + System.lineSeparator() + "2. Das is mir doch egal" + System.lineSeparator() + "3. Die Prinzessin beleidigen" + System.lineSeparator() + "4. Mit der Prinzessin flirten und sie befreien" + "\n");

        String line = null;

        while (line == null) {
            line = scan();

            if (line.contains("1") || line.contains("helfen")) {
                karmaCounter += 1;
                System.out.println("Du befreist die Prinzessin, sie bedankt sich!" + "\n");
            } else if (line.contains("2") || line.contains("egal")) {
                karmaCounter -= 1;
                princessFatherHatesYou = true;
                System.out.println("Du gehst einfach weg, was mit der Prinzessin geschieht ist dir egal." + "\n");
            } else if (line.contains("3") || line.contains("beleidigen") || line.contains("arschloch")) {
                karmaCounter -= 5;
                princessFatherHatesYou = true;
                System.out.println("Du drehst dich um, die Prinzessin weint, in ihrem Jammer, befreit sie sich selbst und rennt davon." + "\n");
            } else if (line.contains("4") || line.contains("flirten") || line.contains("schön")) {
                karmaCounter += 2;
                princessFellInLove = true;
                System.out.println("Die Prinzessin verliebt sich in dich und geht glücklich davon." + "\n");
            } else {
                line = null;
                System.out.println(TextUtil.explanationPrincess);
            }
        }
    }

    static void oldFriend() {
        System.out.println(TextUtil.introOldFriend);
        System.out.println(AsciiUtil.asciiFriends);
        System.out.println("Antwort" + System.lineSeparator() + "1. Hier dein Gold" + System.lineSeparator() + "2. Hab ich nicht" + System.lineSeparator() + "3. clevere Ausrede, mit der du versuchst deinen Freund zu verarschen" + "\n");

        String line = null;

        while (line == null) {
            line = scan();

            if (line.contains("1") || line.contains("geben")) {
                System.out.println("Du gibst deinem Freund das Gold und er bedankt sich" + "\n");
            } else if (line.contains("2") || line.contains("nicht")) {
                System.out.println("Du hast das Gold nicht." + System.lineSeparator() + "'Keine Sorge, gib es mir einfach sobald du es hast'" + "\n");
            } else if (line.contains("3") || line.contains("verarschen") || line.contains("ausrede")) {
                System.out.println("Du versuchst deinen Freund zu verarschen." + System.lineSeparator() + "'Du denkst du spielst Schach, aber du spielst kein Schach Digger. Du spielst Schach gegen dich selber!'" + "\n");
            } else {
                line = null;
                System.out.println(TextUtil.explanationOldFriend);
            }
        }
    }

    static void father() {
        System.out.println(TextUtil.introFather);

        if (princessFatherHatesYou && youMetThePrincess) {
            System.out.println("Du Arschloch hast meiner Tochter nicht geholfen. Verpiss dich" + "\n");
        } else if (princessFellInLove) {
            System.out.println("Ah hallo mein Schwiegersohn, nimm diese 10 Gold" + "\n");
        } else {
            System.out.println("Hallo was geht, ich bin hier der Schmied" + System.lineSeparator());
            System.out.println(youMetThePrincess
                    ? "Hier 3 Gold dafür das du meiner Tochter geholfen hast" + "\n"
                    : "Meine Tochter ist verschwunden, wenn du sie triffst, bitte hilf ihr. Sie ist die aktuelle Miss Velen" + "\n");
        }
        System.out.println(AsciiUtil.asciiVillage);
    }

    static void dragon() {
        System.out.println(TextUtil.introDragon);
        System.out.println(AsciiUtil.asciiDragon);
        System.out.println("Möchtest du die Prinzessin warnen?");

        String line = null;

        while (line == null) {
            line = scan();

            if (line.contains("ja") || line.contains("yes") || line.contains("1")) {
                karmaCounter += 2;
                System.out.println(kind ? "Du warnst die Prinzessin und sie kann ein stück vom Drachen entkommen" + "\n" : "Die Prinzessin bemerkt dich und macht einen Schritt von dir weg. Sie tritt dem Drachen auf den Fuß und dieser frisst sie" + "\n");
            } else if (line.contains("nein") || line.contains("no") || line.contains("2") || line.contains("nicht")) {
                karmaCounter -= 5;
                System.out.println("Die Prinzessin bemerkt dich nicht, aber leider auch nicht den Drachen. Sie ist in großer Gefahr!" + "\n");
            } else {
                line = null;
                System.out.println(TextUtil.explanationDragonWarnPrincess);
            }
        }

        System.out.println(TextUtil.introDragonFight);
        if (weapon == 1) {
            System.out.println("Möchtest du deinen Bogen zum Angriff nutzen?" + "\n");
        } else if (weapon == 2) {
            System.out.println("Möchtest du deine Axt zum Angriff nutzen?" + "\n");
        } else {
            System.out.println("Möchtest du den Drachen Angreifen?" + "\n");
        }

        String drachline = null;

        while (drachline == null) {
            drachline = scan();

            if (drachline.contains("ja") || drachline.contains("yes") || drachline.contains("1") || line.contains("angriff")) {
                karmaCounter += 1;
                System.out.println(karmaCounter > 5 ? "Du erschlägst den Drachen" + "\n" : "Der Drache frisst dich" + "\n");
            } else if (drachline.contains("nein") || drachline.contains("no") || drachline.contains("2") || line.contains("rückzug")) {
                karmaCounter -= 1;
                System.out.println("Der Drache schlägt nach dir." + "\n");
                if (karmaCounter < 0) {
                    System.out.println("Der Drache zerfetzt dich in Tausend kleine Stücke" + "\n");
                } else {
                    System.out.println("Du kannst ausweichen" + "\n");
                    System.out.println("Du rennst davon und versteckst dich" + (gnomeClubMember ? "im Trollclub" + "\n" : "im Dorf" + "\n"));
                }
            } else {
                drachline = null;
                System.out.println(TextUtil.explanationDragonFight);
            }
        }
    }
}