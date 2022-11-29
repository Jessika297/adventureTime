package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AdventureLetsGo {

    static int karma = 0;
    static boolean gnomeClub = false;
    static boolean kind = true;
    static boolean love = false;
    static boolean fatherHate = false;
    static boolean metPrincess = false;
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
                    System.out.println("Du gehst weiter den Weg entlang, für den du dich entschieden hast");
                }
                case "GnomeRiddle" -> {
                    gnomeRiddle();
                    AdventureSteps.remove("GnomeRiddle");
                    System.out.println("Puh, das war aber ein schwieriges Rätsel. Du gehst weiter und hoffst nicht nochmal eins lösen zu müssen." + System.lineSeparator());
                }
                case "Hut" -> {
                    hut();
                    AdventureSteps.remove("Hut");
                    System.out.println("Unsicher, ob du dich richtig entschieden hast, gehst du weiter. In der Ferne lässt sich etwas erkennen." + System.lineSeparator());
                }
                case "Princess" -> {
                    princess();
                    AdventureSteps.remove("Princess");
                    System.out.println("Die Frage, ob es die Prinzessin wohl nach Hause schafft beschleicht dich, doch du schüttelst den Gedanken ab und gehst weiter" + System.lineSeparator());
                }
                case "OldFriend" -> {
                    oldFriend();
                    AdventureSteps.remove("OldFriend");
                    System.out.println("Einen alten Freund zu treffen ist immer erstmal schön, auch wenn mal ein unangenehmes Thema aufkommt. Voller elan stürtz du dich weiter ins Abenteuer");
                }
                case "Father" -> {
                    father();
                    AdventureSteps.remove("Father");
                    System.out.println("Eigentlich ist das Dorf ganz gemütlich, aber du fühlst dich noch nicht bereit sesshaft zu werden und so machst du dich wieder auf den Weg.");
                }

                default ->
                        System.out.println("Das Abenteuer ist zu einem abrupten Ende gekommen. Wenn du möchtest kannst du es neu starten und dem Autor über den Fehler informieren");
            }
        }
        System.out.println(System.lineSeparator() + "Als du weiter gehst, beginnt epische Kampfmusik im Hintergrund");
        dragon();
        System.out.println("The End");
    }

    public static String scan() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine().toLowerCase();
    }

    static void crossroad() {
        System.out.println("Du stehst in einem Wald. Links geht es nicht weiter. Du kannst aber geradeaus oder rechts lang gehen.");
        System.out.println("Wofür entscheidest du dich?" + "\n");

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
                System.out.println("Das geht leider nicht. Möchtest du gerade aus gehen, schreibe 'geradeaus'." + System.lineSeparator()
                        + "Möchtest du rechts entlang gehen, schreibe 'rechts rum'." + System.lineSeparator()
                        + "Möchtest du umdrehen, schreibe 'umdrehen'." + System.lineSeparator()
                        + "Wofür entscheidest du dich?" + "\n");
            }
        }
    }

    static void gnomeRiddle() {
        System.out.println("Du kommst zu einer Brücke. Ein Troll steht dort und stellt dir folgendes Rätsel:" + System.lineSeparator()
                + "Was kann man nicht sehen aber hören und fühlen." + "\n");
        System.out.println("Wähle deine Antwort" + System.lineSeparator()
                + "1. Baby" + System.lineSeparator()
                + "2. Ziege" + System.lineSeparator()
                + "3. Was soll denn diese scheiß Rätselß Piss dich du Opfer" + System.lineSeparator()
                + "4. Der Wind" + "\n");
        System.out.println("Wofür entscheidest du dich?");

        String line = null;

        while (line == null) {
            line = scan();

            if (line.contains("1") || line.contains("eins") || line.contains("baby")) {
                karma += 1;
                System.out.println("Wow bist du dumm, na dann geh mal weiter, mal sehen wie du dich schlägst!" + "\n");
            } else if (line.contains("2") || line.contains("zwei") || line.contains("ziege")) {
                karma -= 1;
                System.out.println("Interessante wahl, aber leider falsch.");
            } else if (line.contains("3") || line.contains("drei") || line.contains("piss dich")) {
                karma -= 5;
                System.out.println("Wenn du keine Lust auf Rätsel hast, dann wird dies eine sehr beschwerliche Reise!" + "\n");
            } else if (line.contains("4") || line.contains("vier") || line.contains("wind")) {
                karma += 5;
                System.out.println("Du hast das Rätsel bestanden. Willst du unserem Trollclub beitreten?" + "\n");

                String trollline = null;

                while (trollline == null) {
                    trollline = scan();

                    if (trollline.contains("ja") || (line.contains("yes") || (line.contains("1")))) {

                        karma += 1;
                        gnomeClub = true;
                        System.out.println("Oh man, endlich ein Mitglied in meinem Trollclub! Wir werden so viel spaß haben" + "\n");
                    } else if (line.contains("nein") || (line.contains("no")) || (line.contains("2"))) {
                        karma -= 1;
                        gnomeClub = false;
                        System.out.println("Warum will denn niemand dem Trollclub beitreten?" + "\n");
                    } else {
                        trollline = null;
                        System.out.println("Was soll das heißen?" + System.lineSeparator()
                                + "Möchtest du beitreten, schreibe 'ja'." + System.lineSeparator()
                                + "Möchtest du nicht beitreten, schreibe 'nein'." + System.lineSeparator()
                                + "Wofür entscheidest du dich?" + "\n");
                    }
                }
                System.out.println("Na dann mal ab mit dir" + "\n");
            } else {
                line = null;
                System.out.println("Das geht leider nicht. schreibe die Zahl zur Antwort." + System.lineSeparator()
                        + "1. Babys" + System.lineSeparator()
                        + "2. Ziegen" + System.lineSeparator()
                        + "3. Was soll denn diese scheiß Rätselß Piss dich du Opfer" + System.lineSeparator()
                        + "4. Der Wind" + "\n");
            }

        }
    }

    static void hut() {
        System.out.println("""
                          _
                        _|=|__________
                       /              \\
                      /                \\
                     /__________________\\
                      ||  || /--\\ ||  ||
                      ||[]|| | .| ||[]||
                    ()||__||_|__|_||__||()
                   ( )|-|-|-|====|-|-|-|( )
                jgs^^^^^^^^^^====^^^^^^^^^^^""");
        System.out.println("Du stehst vor einer Hütte. Die Tür steht offen, du könntest hineingehen oder dem Weg um die Hütte folgen");
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
                System.out.println("Das geht leider nicht. Möchtest du hinein gehen, schreibe 'rein'." + System.lineSeparator()
                        + "Möchtest du herum gehen, schreibe 'herum'." + System.lineSeparator()
                        + "Wofür entscheidest du dich?" + "\n");
            }
        }
    }

    static void weaponChoice() {
        System.out.println("""
                 _,-,
                T_  |
                ||`-'
                ||
                ||
                ~~""");
        System.out.println("""
                    _
                .-'` |___________________________//////
                `'-._|                           \\\\\\\\\\\\""");
        System.out.println("In der Hütte findest du zwei Waffen" + System.lineSeparator()
                + "1. Bogen" + System.lineSeparator()
                + "2. Axt" + System.lineSeparator()
                + "Du kannst nur höchstens einen Gegenstand mitnehmen." + "\n");
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
            } else if (line.contains("0") || line.contains("kein") || line.contains("nicht")) {
                karma += 2;
                weapon = 3;
                System.out.println("Du entschiedest dich den weg eines Pazifisten zu gehen." + "\n");
            } else {
                line = null;
                System.out.println("Das geht leider nicht. Möchtest du den Bogen nehmen, schreibe '1'." + System.lineSeparator()
                        + "Möchtest du die Act nehmen, schreibe '2'." + System.lineSeparator()
                        + "Möchtest du keine Waffe nehmen, schreibe '3'." + System.lineSeparator()
                        + "Wofür entscheidest du dich?" + "\n");
            }
        }
    }

    static void princess() {
        metPrincess = true;
        System.out.println("""
                        WWWWW
                       ((. .))   \s
                      ))) - (((	 \s
                    ((((`...')))      \s
                     ))))\\  /(((   	     \s
                     /    \\/    \\
                    / /\\      /\\ \\
                   / /  \\    /  \\ \\
                  @@@@  / \\/ \\  @@@@
                  (v   /      \\   v) \s
                      @@@@@@@@@@
                     /          \\
                    /            \\
                   @@@@@@@@@@@@@@@@
                  /                \\
                 /                  \\
                @@@@@@@@@@@@@@@@@@@@@@
                        v  v""");
        System.out.println("Du triffst eine wunderschöne Prinzessin." + System.lineSeparator()
                + "Hallo Freund, kannst du mir helfen, mein Kleid hat sich in diesem Ast verfangen" + "\n");
        System.out.println("Deine Antwort:" + System.lineSeparator()
                + "1. 'Ja natürlich helfe ich dir'" + System.lineSeparator()
                + "2. Das is mir doch egal" + System.lineSeparator()
                + "3. Die Prinzessin beleidigen" + System.lineSeparator()
                + "4. Mit der Prinzessin flirten und sie befreien" + "\n");

        String line = null;

        while (line == null) {
            line = scan();

            if (line.contains("1") || line.contains("helfen")) {
                karma += 1;
                System.out.println("Du befreist die Prinzessin, sie bedankt sich!" + "\n");
            } else if (line.contains("2") || line.contains("egal")) {
                karma -= 1;
                fatherHate = true;
                System.out.println("Du gehst einfach weg, was mit der Prinzessin geschieht ist dir egal." + "\n");
            } else if (line.contains("3") || line.contains("beleidigen") || line.contains("arschloch")) {
                karma -= 5;
                fatherHate = true;
                System.out.println("Du drehst dich um, die Prinzessin weint, in ihrem Jammer, befreit sie sich selbst und rennt davon." + "\n");
            } else if (line.contains("4") || line.contains("flirten") || line.contains("schön")) {
                karma += 2;
                love = true;
                System.out.println("Die Prinzessin verliebt sich in dich und geht glücklich davon." + "\n");
            } else {
                line = null;
                System.out.println("Das geht leider nicht. Möchtest du gerade aus gehen, schreibe 'geradeaus'." + System.lineSeparator()
                        + "Möchtest du rechts entlang gehen, schreibe 'rechts rum'." + System.lineSeparator()
                        + "Möchtest du umdrehen, schreibe 'umdrehen'." + System.lineSeparator()
                        + "Wofür entscheidest du dich?" + "\n");
            }

        }
    }

    static void oldFriend() {
        System.out.println("""
                  __      _                _    \s
                 / _|    (_)              | |   \s
                | |_ _ __ _  ___ _ __   __| |___\s
                |  _| '__| |/ _ \\ '_ \\ / _` / __|
                | | | |  | |  __/ | | | (_| \\__ \\
                |_| |_|  |_|\\___|_| |_|\\__,_|___/
                                                \s
                                                \s""");
        System.out.println("Du triffst einen alten Freund. Du erinnerst dich, dass du ihm noch 3 Gold schuldest." + System.lineSeparator()
                + "Er fragt dich 'wo ist eigentlich mein Gold mein Freund?'" + "\n");
        System.out.println("Antwort" + System.lineSeparator()
                + "1. Hier dein Gold" + System.lineSeparator()
                + "2. Hab ich nicht" + System.lineSeparator()
                + "3. clevere Ausrede, mit der du versuchst deinen Freund zu verarschen" + "\n");

        String line = null;

        while (line == null) {
            line = scan();

            if (line.contains("1") || line.contains("geben")) {
                System.out.println("Du gibst deinem Freund das Gold und er bedankt sich" + "\n");
            } else if (line.contains("2") || line.contains("nicht")) {
                System.out.println("Du hast das Gold nicht." + System.lineSeparator()
                        + "'Keine Sorge, gib es mir einfach sobald du es hast'" + "\n");
            } else if (line.contains("3") || line.contains("verarschen") || line.contains("ausrede")) {
                System.out.println("Du versuchst deinen Freund zu verarschen." + System.lineSeparator()
                        + "'Du denkst du spielst Schach, aber du spielst kein Schach Digger. Du spielst Schach gegen dich selber!'" + "\n");
            } else {
                line = null;
                System.out.println("Das geht leider nicht. Möchtest du das Geld zurück geben, schreibe '1'." + System.lineSeparator()
                        + "Möchtest du rechts kein Geld geben, schreibe '2'." + System.lineSeparator()
                        + "Möchtest du deinen Freund verarschen, schreibe '3'." + System.lineSeparator()
                        + "Wofür entscheidest du dich?" + "\n");
            }
        }
    }

    static void father() {
        System.out.println("""
                ~         ~~          __
                                  _T      .,,.    ~--~ ^^
                            ^^   // \\                    ~
                                 ][O]    ^^      ,-~ ~
                              /''-I_I         _II____
                           __/_  /   \\ ______/ ''   /'\\_,__
                             | II--'''' \\,--:--..,_/,.-{ },
                           ; '/__\\,.--';|   |[] .-.| O{ _ }
                           :' |  | []  -|   ''--:.;[,.'\\,/
                           '  |[]|,.--'' '',   ''-,.    |
                             ..    ..-''    ;       ''. '""");
        System.out.println("Du stehst in einem Dorf. Ein Mann kommt auf dich zu, er sagt" + "\n");
        if (!fatherHate && !love) {
            System.out.println("Hallo was geht, ich bin hier der Schmied" + System.lineSeparator());
            System.out.println(metPrincess
                    ? "Hier 3 Gold dafür das du meiner Tochter geholfen hast" + "\n"
                    : "Meine Tochter ist verschwunden, wenn du sie triffst, bitte hilf ihr. Sie ist die aktuelle Miss Velen" + "\n");
        } else if (fatherHate && metPrincess) {
            System.out.println("Du Arschloch hast meiner Tochter nicht geholfen. Verpiss dich" + "\n");
        } else if (love) {
            System.out.println("Ah hallo mein Schwiegersohn, nimm diese 10 Gold" + "\n");
        } else {
            System.out.println("Ich hab dir nix zu sagen" + "\n");
        }
    }

    static void dragon() {
        System.out.println("Ein großer böser Drache steht neben der Prinzessin");
        System.out.println("""
                                \\||/
                                |  @___oo
                      /\\  /\\   / (__,,,,|
                     ) /^\\) ^\\/ _)
                     )   /^\\/   _)
                     )   _ /  / _)
                 /\\  )/\\/ ||  | )_)
                <  >      |(,,) )__)
                 ||      /    \\)___)\\
                 | \\____(      )___) )___
                  \\______(_______;;; __;;;""");
        System.out.println("Möchtest du die Prinzessin warnen?");

        String line = null;

        while (line == null) {
            line = scan();

            if (line.contains("ja") || line.contains("yes") || line.contains("1")) {
                karma += 2;
                System.out.println(kind
                        ? "Du warnst die Prinzessin und sie kann ein stück vom Drachen entkommen" + "\n"
                        : "Die Prinzessin bemerkt dich und macht einen Schritt von dir weg. Sie tritt dem Drachen auf den Fuß und dieser frisst sie" + "\n");
            } else if (line.contains("nein") || line.contains("no") || line.contains("2") || line.contains("nicht")) {
                karma -= 5;
                System.out.println("Die Prinzessin bemerkt dich nicht, aber leider auch nicht den Drachen. Sie ist in großer Gefahr!" + "\n");
            } else {
                line = null;
                System.out.println("Das geht leider nicht. Möchtest du die Prinzessin warnen, schreibe 'ja'." + System.lineSeparator()
                        + "Möchtest du sie nicht warnen, schreibe 'nein'." + System.lineSeparator()
                        + "Wofür entscheidest du dich?" + "\n");
            }
        }

        System.out.println("Der große böse Drache sieht sehr wütend aus. Er macht einen Schritt auf dich zu." + "\n");
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
                karma += 1;
                System.out.println(karma > 5
                        ? "Du erschlägst den Drachen" + "\n"
                        : "Der Drache frisst dich" + "\n");
            } else if (drachline.contains("nein") || drachline.contains("no") || drachline.contains("2") || line.contains("rückzug")) {
                karma -= 1;
                System.out.println("Der Drache schlägt nach dir." + "\n");
                if (karma < 0) {
                    System.out.println("Der Drache zerfetzt dich in Tausend kleine Stücke" + "\n");
                } else {
                    System.out.println("Du kannst ausweichen" + "\n");
                    System.out.println("Du rennst davon und versteckst dich" + (gnomeClub ? "im Trollclub" + "\n" : "im Dorf" + "\n"));
                }
            } else {
                drachline = null;
                System.out.println("Das geht leider nicht. Du möchtest angreifen? Schreibe 'ja'." + System.lineSeparator()
                        + "Möchtest du nicht angreifen, schreibe 'nein'." + System.lineSeparator()
                        + "Wofür entscheidest du dich?" + "\n");
            }
        }
    }
}