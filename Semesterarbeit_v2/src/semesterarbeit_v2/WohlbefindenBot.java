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
    Klasse für den Fragenkatalog Wohlbefinden des Bots
    Alle Darstellungen für A4 Ausdruck zusammengerückt.
 */
package semesterarbeit_v2;

import java.util.Random;

public class WohlbefindenBot {
    
    
    void wohlBot(){
        // Erzählt einen zufälligen Satz aus dem Array über sein
        // eignes Wohlbefinden.
        
        // Generator implementieren
        Random rndGen = new Random();
        // Mögliche Antworten
        String[] wohlBotArray = {
            "Naja ich bin bugfrei, compiliert und am laufen. "
                + "\nAlso sehr gut.",
            "Also kann ich mich nicht beklagen. "
                + "\nDu könntest aber mal etwas mehr RAM einbauen. ;) ",
            "RAM gebt mir mehr RAAAMMM!! "
                + "\nUnd CPU!!",
            "So einem schönen Code kann es nur gut gehen!"
        };

        // Zufällige Auswahl eines Satzes
        int botIndex = rndGen.nextInt(4);
        // Ausgabe des Zufallssatzes
        System.out.println(wohlBotArray[botIndex]);
    }
    
}
