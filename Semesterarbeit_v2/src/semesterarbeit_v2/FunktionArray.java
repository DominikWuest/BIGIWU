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
    Klasse für Funktion FunktionArray. Die Funktion überprüft den Wörter
    String und sucht in dem Array nach einem passenden Wort. Findet er
    eines gibt er true zurück. Findet er keine gibt er false zurück.
    Alle Darstellungen für A4 Ausdruck zusammengerückt.
 */
package semesterarbeit_v2;

public class FunktionArray {
   public static boolean uebereinstimungen(String[] woerter, String[] arrays) {
       // falls woerter = null oder arrays = null gebe false zurück
       if (woerter == null || arrays == null) {
           return false;
       }
       
       // Prüfe woerter in dem definierten Arrays und prüfe ob identisches
       // Wort vorhanden. Ignoriere Grossklein Schreibung.
       // Falls gefunden gebe true zurück. Falls nicht False.
       for (String word: woerter) {
           for (String array: arrays) {
               if (word.equalsIgnoreCase(array)) {
                   return true;
               }
           }
       }
       // Gebe false zurück falls nichts gefunden.
       return false;
   }
}
