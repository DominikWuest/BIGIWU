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
    Klasse für die Helfenansage. Gibt einen zufällgen Satz aus.
    Alle Darstellungen für A4 Ausdruck zusammengerückt.
 */
package semesterarbeit_v2;

import java.util.Random;

public class HelfenAussage {

    void helfenSammlung(NameUser nameUser1) {

        // Generator implementieren
        Random rndGen = new Random();
        // Mögliche Antworten
        String[] helfenAuswahl = {"Wie kann ich dir helfen "
            + nameUser1.getNameUser() + "?",
            "Was ist deine Frage " + nameUser1.getNameUser() + "?",
            nameUser1.getNameUser()
            + ", zu welchen Thema kann ich Auskunft geben?",
            "Was kann ich für dich tun " + nameUser1.getNameUser() + "?",
            nameUser1.getNameUser()
            + " ich bin bereit für eine neue Anfrage."};

        // Zufällige Auswahl eines Satzes
        int helfenIndex = rndGen.nextInt(5);
        // Ausgabe des Zufallssatzes
        System.out.println(helfenAuswahl[helfenIndex]);

    }

}
