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
    Klasse für den Fragenkatalog Firewall
 */
package semesterarbeit_v2;


public class Firewall {
    
    void detailiertFirewall(){
        System.out.println("Die Feuerwand. Ein wichtiger Bestandteil "
                + "eines jeden Unternehmensnetzwerkes.");
        System.out.println("Klassisch ist die Firewall eine "
                + "Netzwerkkomponente welche sich zwischen dem "
                + "Router und dem Coreswitch befindet.");
        System.out.println("Es soll die Sicherheit im Netzwerk steigern, "
                + "in dem es jedes einzelne Paket welches ankommt überprüft.");
        System.out.println("Entspricht das Paket nicht den Richtlinen, "
                + "so wird dieses von der Firewall blockiert.");
        System.out.println("Zuhause wirst du wahrscheinlich keine "
                + "Firewall rumstehen haben.");
        System.out.println("Windows hat hierfür eine Software "
                + "Firewall entwickelt.");
        System.out.println("Diese ist für den Heimbedarf ausreichend "
                + "und kann deinen Computer schützen.");
        System.out.println("Für grosse Unternehmen ist eine Hardware "
                + "Firewall notwendig, um das Netzwerk zu schützen.");
        System.out.println("Die Firewall kann auch noch viele weitere "
                + "Aufgaben übernehmen wie z.B. VPN, Traffic Controll");
    }
    
}
