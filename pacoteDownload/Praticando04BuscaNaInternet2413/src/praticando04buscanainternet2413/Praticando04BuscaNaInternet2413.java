/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praticando04buscanainternet2413;

import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class Praticando04BuscaNaInternet2413 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner (System.in);
        int t = teclado.nextInt();
        
        int link2 = 2*t;
        int link1 = link2 * 2;
        int link3 = t;
        
        System.out.println(link1);
        
    }
    
}
