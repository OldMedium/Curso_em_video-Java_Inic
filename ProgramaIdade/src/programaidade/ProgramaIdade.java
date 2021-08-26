/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author Rukasu
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.print("Em que ano você nasceu? ");
        int nasc = tec.nextInt();
        int i = 2021 - nasc;
        System.out.println("Sua idade é " + i);
        if (i<16) {
            System.out.println("Voto proíbido");
        } else {
            if ((i>=16 && i<18) || (i>70)) {
                System.out.println("Voto opcional");
            } else {
                System.out.println("Voto obrigatório");
            }
        }
    }
    
}
