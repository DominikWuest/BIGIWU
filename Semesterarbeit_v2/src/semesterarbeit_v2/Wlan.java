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
    Klasse für den Fragenkatalog WLAN
    Alle Darstellungen für A4 Ausdruck zusammengerückt.
 */
package semesterarbeit_v2;

public class Wlan {

    // Gibt dem User eine kurze eigene Zusammenfassung über das
    // WLAN zurück.
    void detailiertWlan(NameUser nameUser1) {
        System.out.println("Zum Thema WLAN kann ich dir "
                + "helfen " + nameUser1.getNameUser() + ".");
        System.out.println("WLAN steht für Wireless Local Area Network.");
        System.out.println("Hiermit ist eine 2.4 GHZ oder 5 GHZ "
                + "Funkverbindung gemeint, mit welcher Internet ohne");
        System.out.println("auf ein Kabel angewiesen zu sein zu einem "
                + "Gerät übertragen werden kann.");
        System.out.println("Wi-Fi ist ein für Vermarktungszwecke "
                + "erfundener Kunstbegriff,");
        System.out.println("der in Analogie zu Hi-Fi gebildet wurde.");
        System.out.println("Er diente dafür um das freie WLAN attraktiv "
                + "zu vermarkten.");
    }
}
