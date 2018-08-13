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
 */
package semesterarbeit_v2;


public class Wetter {

    void detailiertWetter() {

        System.out.println("Da ich auf deinem Notebook gefangen bin, starte ich für dich eine Suche bei Google.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        String question = "Wetter heute";

        question = question.replace(' ', '+');

        try {
            Runtime.getRuntime().exec(new String[]{"cmd", "/c", "start chrome https://www.google.com/search?q=" + question});
        } catch (Exception e) {

        }
    }

}
