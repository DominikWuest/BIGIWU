/*
    Semesterarbeit "Objektorientierter Chatbot" 
    Schule:     ABB Technikerschule Baden
    Semester:   4
    Klasse:     B18-if4.1
    Authoren:
                Dominik Wüst
                Andri Binda
                Marek Giesen
    
 */

 /*
In dieser Klasse wird das Menu ausgegeben. 
 */
package semesterarbeit_v2;

import java.util.Scanner;


// DIESE KLASSE WIRD NICHT MEHR BENÖTIGT!!!!
// WIRD SPÄTER GELÖSCHT!!!
public class Menu {

    private Scanner mEingabe = new Scanner(System.in);
    BinaerRechner rechnerBin = new BinaerRechner();

    void eingabeMenu() {
        int optionMenu;
        anzeigenMenu();

        do {
            System.out.print("Dein Thema: ");
            optionMenu = mEingabe.nextInt();
            switch (optionMenu) {
                case 1: { // Subnetrechner
                    System.out.println("Deine Wahl war Subnetrechner. "
                            + "Ich starte für dich den Subnetrechner.");

                    break;
                }
                case 2: { // Binärrechner
                    System.out.println("Deine Wahl war Binärrechner. "
                            + "Ich starte für dich den Binärrechner.");
                    eingabeBinrechner();
                    break;
                }
                case 3: { // 

                    break;
                }

                case 0: { // Beenden
                    System.out.println("Bye bye!");
                    break;
                }
                default: {
                    System.out.println("Ungueltige Eingabe!");
                    break;
                }
            }
        } while ((optionMenu != 0) && (optionMenu != 1) && (optionMenu != 2));

    }

    private void anzeigenMenu() {

        System.out.println("----- Themen -----");
        System.out.println("Subnetrechner....1");
        System.out.println("Binärrechner.....2");
        System.out.println("Beenden..........0");
        System.out.println("------------------");

    }

    void eingabeBinrechner() {
        int optionBin;
        binrechnerMenu();
        do {
            System.out.print("Deine Wahl: ");
            optionBin = mEingabe.nextInt();
            switch (optionBin) {
                case 1: { // Bin -> Dez
                    System.out.println("Ich starte für dich Binär "
                            + "zu Dezimal.");
                    rechnerBin.bintoDezRechner();

                    break;
                }
                case 2: { // Dez -> Bin
                    System.out.println("Ich starte für dich Dezimal "
                            + "zu Binär.");
                    rechnerBin.deztoBinRechner();
                    break;
                }
                case 0: { // Zurück
                    System.out.println("Gehe zurück");
                    eingabeMenu();
                    break;
                }
                default: {
                    System.out.println("Ungueltige Eingabe!");
                    break;
                }
            }
        } while ((optionBin != 0) && (optionBin != 1) && (optionBin != 2));

    }

    private void binrechnerMenu() {

        System.out.println("Für den Binärrechner gibt es 2 Modi.");
        System.out.println("Einmal von Binär nach Dezimal und Dezimal zu"
                + " Binär.");
        System.out.println("Welchen darf ich für dich starten?");
        System.out.println("----- Binärrechner -----");
        System.out.println("Binär -> Dezimal.......1");
        System.out.println("Dezimal -> Binär.......2");

    }

}
