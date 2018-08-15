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
    Klasse für die Witze. Soll zufällig einen Witz ausgeben.
 */
package semesterarbeit_v2;

import java.util.Random;
import java.util.Scanner;

public class Witz {

    void witzeSammlung() {

        // Generator implementieren
        Random rndGen = new Random();
        
        String[] witzeAuswahl = {"Zwei Jäger treffen sich.", 
            "Was ist grün und auf Knopfdruck rot? \nEin Frosch in einem Mixer.", 
            "Ich konnte es nicht fassen. Mein Nachbar hat tatsächlich noch"
                + " um 3 Uhr Nachts bei uns geklingelt. "
                + "\nMir wäre fast die Bohrmaschine runtergefallen.", 
            "Berühmte letzte Worte eines Fallschirmspringers. "
                + "\nImmer diese blöden Motten."};

        int witzIndex = rndGen.nextInt(4);
        
        System.out.println(witzeAuswahl[witzIndex]);
        
        
    }

}
