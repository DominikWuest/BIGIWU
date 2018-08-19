/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterarbeit_v2;

/**
 *
 * @author gima
 */
public class FunktionArray {
   public static boolean uebereinstimungen(String[] woerter, String[] arrays) {
       if (woerter == null || arrays == null) {
           return false;
       }
       
       for (String wa: woerter) {
           for (String wb: arrays) {
               if (wa.equalsIgnoreCase(wb)) {
                   return true;
               }
           }
       }
       
       return false;
   }
}
