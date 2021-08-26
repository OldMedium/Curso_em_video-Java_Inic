/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor04;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Rukasu
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        Arrays.sort(vet);
        for (int v:vet) {
            System.out.print(v + " ");
        }

        Scanner tec = new Scanner(System.in);
        int tc = tec.nextInt();
        int p = Arrays.binarySearch(vet, tc);
        System.out.println("Valor encontrado na posição? " + p);
    }
    
}
