/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkubangundatar;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Kalkubangundatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public void p_panjang()
 {
        Scanner input = new Scanner(System.in);
        double p,l,luas,keliling;
        System.out.println("\n–> Persegi Panjang <–");
        System.out.print("Masukkan Panjang : ");
        p = input.nextDouble();
         System.out.print("Masukkan Lebar : ");
        l = input.nextDouble();
        System.out.println("=>");
        luas = p*l;
        keliling =  2*(p + l);
        System.out.print("Luas  = " + (int)luas + "\nKeliling  = "+ (int)keliling);
        System.out.println("");
        }
}
