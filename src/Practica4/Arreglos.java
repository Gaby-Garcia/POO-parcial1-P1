package Practica4;

import java.util.Scanner;

public class Arreglos {
    private int n= 10;
    private double [] num;
    private double suma =0;
    private double promedio;
    Scanner sc = new Scanner(System.in);
    
    public void Letrero(){
        System.out.println("Pedir 10 numeros y sacar promedio de estos");
    }
    
    public void Capturar(){
        System.out.println(" ");
            num= new double[n];
            for (int i = 0; i < n; i++) {
                  System.out.print("Introdusca un numero:");
                    num[i]= sc.nextInt(); 
                     suma+=num[i];
                        promedio= suma/n;
            }
      }
          
    public void Imprimir(){
        System.out.println("La suma es: " + suma);
        System.out.println(" El promedio es: "+ promedio);
    }
}
