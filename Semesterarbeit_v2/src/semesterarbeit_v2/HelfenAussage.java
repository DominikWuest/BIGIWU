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
    Klasse für die Helfen ansage. Gibt einen zufällgen Satz aus.
 */
package semesterarbeit_v2;

import java.util.Random;

public class HelfenAussage {
    
    void helfenSammlung() {

        // Generator implementieren
        Random rndGen = new Random();
        // Mögliche Antworten
        String[] helfenAuswahl = {"Wie kann ich dir helfen?", 
        "Was ist deine Frage?",
        "Zu welchen Thema kann ich Auskunft geben?",
        "Was kann ich für dich tun?"};

        // Zufällige Auswahl eines Satzes
        int helfenIndex = rndGen.nextInt(4);
        // Ausgabe des Zufallssatzes
        System.out.println(helfenAuswahl[helfenIndex]);
        
        
    }
    
}
