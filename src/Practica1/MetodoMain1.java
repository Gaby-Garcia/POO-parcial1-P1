package Practica1;
import java.util.Scanner;
public class MetodoMain1 {
    
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int numfilas;
        System.out.println("PIRAMIDE ALINEADA A LA IZQUIERDA ");
        System.out.print("¿Cuantas filas desea tener en la piramide? ");
        numfilas= sc.nextInt();
        
        for (int i = 0; i < numfilas; i++) {
            for (int cant = 0; cant <= i; cant++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
                
                
                
                
                
                
                
                
        
        
        
        
}
}