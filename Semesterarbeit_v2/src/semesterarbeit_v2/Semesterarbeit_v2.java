
package semesterarbeit_v2;


public class Semesterarbeit_v2 {

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
    // MainKlasse für Chatbot
    public static void main(String[] args) {
        // Objekte aus Klassen erstellen
        
        Begruessung b1 = new Begruessung();
        WohlbefindenUser u1 = new WohlbefindenUser();
        FragenAntwort f1 = new FragenAntwort();
        
        
        // Objekte aufrufen
        b1.botBegruessung();
        f1.frageName();
        u1.frageWohlbefinden();

        // True Schlaufe, damit egal aus welchem menue man kommt es
        // erscheint immer wieder der Chat Partner.
        while (true) {            
            f1.chatPartner();
        }
        
        

    }
    
}
