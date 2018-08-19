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
    Klasse für den Fragenkatalog Wetter.
    Öffnet eine Google Search Abfrage nach dem heutigen Wetter mit dem 
    Browser Chrome.
    WICHTIG: ES MUSS GOOGLE CHROME AUF DEM PC INSTALLIERT SEIN UND
    DER RECHNER MUSS EIN WINDOWS VERWENDEN. 
    Haben uns für Google Chrome entschieden, da dieses stabil
    funktioniert und fast jeder dieses Programm verwendet.
    Alle Darstellungen für A4 Ausdruck zusammengerückt.
 */
package semesterarbeit_v2;

public class Wetter {

    void detailiertWetter() {

        // User informieren das Suche in Google gestartet wird.
        System.out.println("Da ich auf deinem Notebook gefangen bin, "
                + "starte ich für dich eine Suche bei Google.");
        try {
            Thread.sleep(5000); // Sleep von 5 s dass User Zeit zum 
            // lesen hat.
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        // Frage welche an Google gestellt wird.
        String question = "Wetter heute";

        question = question.replace(' ', '+');

        try {
            // Startet Google Chrome auf dem PC
            // Gibt selber die Frage nach dem Wetter
            // ein und bestätigt diese
            Runtime.getRuntime().exec(new String[]{"cmd", "/c",
                "start chrome https://www.google.com/search?q="
                + question});
        } catch (Exception e) {

        }
    }

}
