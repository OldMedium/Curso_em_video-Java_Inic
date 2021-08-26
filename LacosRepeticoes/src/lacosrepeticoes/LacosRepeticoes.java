/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacosrepeticoes;

/**
 *
 * @author Rukasu
 */
public class LacosRepeticoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int cc=1; cc<=10; cc++) {
            for (int ct=1; ct<=3; ct++) {
                System.out.println("Contador interno: " + ct);
            }
            System.out.println("Contador principal: " + cc);
        }
    }
    
}
