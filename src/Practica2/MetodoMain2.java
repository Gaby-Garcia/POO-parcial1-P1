package Practica2;
import java.util.Scanner;

public class MetodoMain2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
          int cantfil;
          System.out.println(" PIRAMIDE DE ASTERISCOS ");
            System.out.print("¿CUANTAS FILAS DESEA TENER? ");
            cantfil=sc.nextInt();
        
        for (int Gabyi = 1; Gabyi <= cantfil; Gabyi++) {
            for (int Jim = 1; Jim <=cantfil-Gabyi  ; Jim++) {
                System.out.print(" ");
             }
                for (int Opp = 1; Opp <= (Gabyi*2)-1; Opp++) {
                         System.out.print("*");    
                    }
                        System.out.println();
                  }
            }
     }

