/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Rukasu
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Primeira nota: ");
        float v1 = teclado.nextFloat();
        System.out.print("Segunda nota: ");
        float v2 = teclado.nextFloat();
        float m = (v1+v2)/2;
        System.out.println("Sua média foi: " + m);
        if(m>=9) { System.out.println("Parabéns!");
        } else { System.out.println("Tenta de novo, fera!");}
    }
    
}
