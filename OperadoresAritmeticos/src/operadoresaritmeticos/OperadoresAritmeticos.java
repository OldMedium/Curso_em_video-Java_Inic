/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

import static java.lang.Math.pow;

/**
 *
 * @author Rukasu
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /** int n1 = 3;
        int n2 = 5;
        float m = (n1+n2)/2;
        System.out.println("A média é: " + m);
        */
        
        /*double t = Math.pow(3, 2);
        
        System.out.println(t);*/
        
        /*float v = 8.5f;
        float b = 9.4f;
        
        int ar = (int) Math.round(v);
        int ab = (int) Math.round(b);
        
        System.out.println(ar);
        System.out.println(ab);*/
        
        double rd = Math.random();
        
        int x = (int) (10 + rd * (100-10));
        
        int f = (int) Math.round(x);
        
        System.out.println(f);
        
    }
    
}
