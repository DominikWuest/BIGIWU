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
In dieser Klasse können mit den Übergabeparametern IP-Adresse und Subnetmaske
folgende Informationen zu einem Subnet ausgegeben werden:
- Subnetadresse
- Broadcastadresse
- erste IP im Netz
- letze IP im Netz 
- Anzahl Nutzbarer IP-Adressen
 */
package semesterarbeit_v2;

import java.util.Scanner;

public class SubnetRechner {

    void ipToNetmask() {

        System.out.println("Geben Sie eine IP-Adresse ein: ");
        Scanner IpEingabe = new Scanner(System.in);
        String ip = IpEingabe.nextLine();
        String[] ipOktett = ip.split("\\."); // \\. = RegEx für .

        int[] ipOktettInt = new int[ipOktett.length];
        for (int i = 0; i < ipOktett.length; i++) {
            ipOktettInt[i] = Integer.parseInt(ipOktett[i]);

        }

        System.out.println("Geben Sie die Subnetzmaske ein: ");
        Scanner SubEingabe = new Scanner(System.in);
        String subnetmask = SubEingabe.nextLine();
        String[] subOktett = subnetmask.split("\\."); // \\. = RegEx für .

        int[] subOktettInt = new int[subOktett.length];
        for (int i = 0; i < subOktett.length; i++) {
            subOktettInt[i] = Integer.parseInt(subOktett[i]);

        }

        // Erstes Oktett
        int a = ipOktettInt[0];
        int sa = subOktettInt[0];

        // Zweites Oktett
        int b = ipOktettInt[1];
        int sb = subOktettInt[1];

        // Drittes Oktett
        int c = ipOktettInt[2];
        int sc = subOktettInt[2];

        // Viertes Oktett
        int d = ipOktettInt[3];
        int sd = subOktettInt[3];

        //Berechnungung Netzwerkadresse
        int na = sa & a;
        int nb = sb & b;
        int nc = sc & c;
        int nd = sd & d;

        //Berechnung Broadcastadresse 
        int ba = a | sa ^ 255;
        int bb = b | sb ^ 255;
        int bc = c | sc ^ 255;
        int bd = d | sd ^ 255;

        //Anzahl Hosts
        int anzahlHostBits = 32 - (Integer.bitCount(sa) + Integer.bitCount(sb) + Integer.bitCount(sc) + Integer.bitCount(sd));
        int anzahlHosts = (int) (Math.pow(2, anzahlHostBits) - 2);

        System.out.println("Die Netzwerkadresse lautet: " + na + "." + nb + "." + nc + "." + nd);
        System.out.println("Die Broadcastkadresse lautet: " + ba + "." + bb + "." + bc + "." + bd);
        System.out.println("Die erste IP in diesem Subnet lautet: " + na + "." + nb + "." + nc + "." + (nd + 1));
        System.out.println("Die letzte IP in diesem Subnet lautet: " + ba + "." + bb + "." + bc + "." + (bd - 1));
        System.out.println("Die Anzahl verwendbarer IPs in diesem Subnet lautet: " + anzahlHosts);

    }

}
