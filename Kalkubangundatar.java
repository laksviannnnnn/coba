package kalkubangundatar;

import java.util.Scanner;



class utama {
public double persegi(double s) 
{
//       Scanner input = new Scanner(System.in);
       double luas,keliling;
       System.out.println("\n-> Persegi <-");
       System.out.println("Masukkan Sisi : ");
//       s=input.nextInt();
       System.out.println("=>");
       luas = s * s;
       keliling = 4*s;
       System.out.print("Luas = " + (int)luas + "\nKeliling  = "+ (int)keliling);
       System.out.println("");
       return luas;
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
    public void lingkaran()
    {
        Scanner input = new Scanner(System.in);
        double r, luas,keliling;
        double phi = 3.14;
        System.out.println("\n–> Lingkaran <–");
        System.out.print("Masukkan Jari-jari : ");
        r = input.nextDouble();
        System.out.println("=>");
        luas = phi * r * r;
        keliling = 2 * phi * r;
        System.out.print("hasil  = " + (int)luas +"\nrata = "+ (int)keliling);
        System.out.println("");
    }
 public void segitiga()
 {
     Scanner input = new Scanner(System.in);
     double a,t,luas,keliling;
     System.out.println("\n->Segitiga<-");
     System.out.println("Masukkan Alas : ");
     a = input.nextDouble();
     System.out.println("Masukkan Tinggi : ");
     t = input.nextDouble();
     System.out.println("=>");
     luas = 0.5 * a * t ;
     keliling = 3*t ;   
     System.out.print("hasil = " + (int)luas +"nrata ="+ (int)keliling);
     System.out.println("");
 }
 }

public class Kalkubangundatar{
 
    public static void main (String [] args){
        {
            utama bangun = new utama ();
            Scanner input = new Scanner(System.in);
            double a;
            System.out.println("Menghitung Kalkulator");
            System.out.println("1=> Persegi \n2.=> Persegi Panjang \n3.=> Lingkaran \n4.=> Segitiga \n");
            System.out.println("Masukkan pilihan = ");
            a = input.nextDouble();
//        int masukan = 0;
//        if (a==1)
//            bangun.persegi();
//       else if (a==2)
//          bangun.p_panjang();
//       else if (a==3)
//           bangun.lingkaran();
//       else if (a==4)
//           bangun.segitiga();
//        else
//           System.out.println("pilihan salah");
        }
    }
}
