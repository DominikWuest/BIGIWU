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
    Klasse für die Beschimpfung Aussage. Gibt einen 
    zufälligen Satz wieder.
    Wurde programmiert für die gemeinen Tester ;)
 */
package semesterarbeit_v2;

import java.util.Random;


public class Beschimpfung {
    
    void schimpfSammlung() {

        // Generator implementieren
        Random rndGen = new Random();
        // Mögliche Antworten
        String[] beschimpfungAuswahl = {"Nana, nicht in diesem Ton.", 
            "Das ist nicht sehr nett.", 
            "Ach komm ich will dir nur helfen.", 
            "Echt jetzt?"};
        // Zufällige Auswahl eines Satzes
        int beschimpfungIndex = rndGen.nextInt(4);
        // Ausgabe des Zufallssatzes
        System.out.println(beschimpfungAuswahl[beschimpfungIndex]);
        
        
    }
    
}
