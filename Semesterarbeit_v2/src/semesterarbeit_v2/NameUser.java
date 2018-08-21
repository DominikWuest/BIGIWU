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
    Fragt den Namen des Users und merkt sich diesen für eine spätere
    Wiedergabe.
    Alle Darstellungen für A4 Ausdruck zusammengerückt.
 */
package semesterarbeit_v2;

import java.util.Scanner;

public class NameUser {
    
    // Initialisiere Variabeln
    private String nameUser;
    private Scanner mEingabe = new Scanner(System.in);
    
    // Getter für Name
    public String getNameUser() {
        return nameUser;
    }

    // Setter für Name
    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    // Fragt User nach seinem Namen und speichert diesen ab.
    void frageName() {

        System.out.println("Zuerst mal Hallo von meiner Seite.");
        System.out.println("Mein Name ist Bigiwu-Bot.");
        System.out.println("Wie lautet dein Name?");
        nameUser = mEingabe.nextLine();

        System.out.println("Dein Name lautet also " + nameUser + ".");
        System.out.println("Naja meiner ist ja auch nicht besser...");

    }

}
