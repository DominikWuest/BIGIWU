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
    Klasse für die Antworten zur Frage nach dem Namen des Bots.
    Alle Darstellungen für A4 Ausdruck zusammengerückt.
 */
package semesterarbeit_v2;

// Antwort des Bots auf seine eigene Namensfindung
public class NameBot {

    void detailiertName(NameUser nameUser1) {
        System.out.println("Jaa jaaa " + nameUser1.getNameUser() + ". "
                + "Fragen zu meinen Namen. ;) ");
        System.out.println("Mein Name ist BiGiWu.");
        System.out.println("Du musst wissen, diesen Namen habe ich "
                + "von meinen Erfindern erhalten.");
        System.out.println("Er setzt sich aus den Anfangsbuchstaben "
                + "meiner Erfinder zusammen.");
        System.out.println("Diese heissen Binda, Giesen und Wuest.");
        System.out.println("Wenns nach mir ginge wäre "
                + "mir: GIGACHATBOT3000 auch lieber gewessen.");
    }

}
