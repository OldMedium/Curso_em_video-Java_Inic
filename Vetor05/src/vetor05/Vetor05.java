/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor05;

import java.util.Arrays;

/**
 *
 * @author Rukasu
 */
public class Vetor05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v[] = new int[20];
        double m = (Math.random())*10;
        int r = (int)Math.round(m);
        Arrays.fill(v, r);
        for (int valor: v) {
            System.out.print(valor + " ");    
        }
        
    }
    
}
