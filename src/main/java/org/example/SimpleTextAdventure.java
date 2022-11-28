package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Fragt den Spieler in welche Richtung er weitergehen will.
 */
public class SimpleTextAdventure {
    /**
     * Starte das mini TextAdventure
     * @param args
     */
    public static void main(String[] args) {
        // Gebe dem Spieler eine Ausgabe vor
        System.out.println( "Du stehst in einem Wald. Links geht es nicht weiter. Du kannst aber geradeaus oder rechts lang gehen." );
        System.out.println( "Wofür entscheidest du dich?" );

        // Versuche seine Eingabe zu lesen, zum Beispiel mit Hilfe des BufferedReaders (kann Zeilenweise lesen)
        try ( BufferedReader input = new BufferedReader( new InputStreamReader(System.in) ) ){
            // die eingelesene Zeile ist erst mal null
            String zeile = null;

            // solange diese Zeile null ist tue folgendes
            while ( zeile == null ){
                // lese die Eingabe des Spielers
                zeile = input.readLine();

                if ( zeile.matches( "geradeaus" ) ){
                    // GEH GERADE AUS
                    System.out.println("Du gehst geradeaus!");
                } else if ( zeile.matches( "rechts" ) ){
                    // GEH RECHTS LANG
                    System.out.println( "Du gehst rechts rum." );
                } else if ( zeile.matches( "dreh um" ) ){
                    // DREH UM
                    System.out.println("Du drehst dich um.");
                } else { // immer daran denken, dass der Spieler auch falsche Eingaben tätigen kann. Das sollte man auch abhandeln.
                    zeile = null;
                    System.out.println( "Das geht leider nicht. Möchtest du gerade aus gehen, schreibe 'geradeaus'." + System.lineSeparator()
                            + "Möchtest du rechts entlang gehen, schreibe 'rechts rum'." + System.lineSeparator()
                            + "Möchtest du umdrehen, schreibe 'umdrehen'." + System.lineSeparator()
                            + "Wofür entscheidest du dich?");
                } // schon fertig...
            }
        } catch (IOException e) { // Fehler abhandeln nicht vergessen.
            e.printStackTrace();
        }
    }}