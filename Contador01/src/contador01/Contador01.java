/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author Rukasu
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cb = 1;
        while (cb<=10) {
            cb++;
            if (cb == 2 || cb == 4 || cb == 6) {
                continue;
            }
            if (cb == 8) {
                break;
            }
            
            System.out.println(cb + "º " + "Cambalhota");
        }
    }
    
}
