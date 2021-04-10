package Practica5;
import java.util.Scanner;
public class Arreglos2 {
private int[] num;
private int num2;
private int posicion=0;

Scanner poo = new Scanner(System.in);

public void Letrero(){
    System.out.println("Pedir al usuario un numero y muestre la posicion en la cual se encuentra");
}

public void CapturarDatos(){
    num= new int[10];
    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce un numero: ");
    num[i]= poo.nextInt();
   
  }
    System.out.print("Ingresa un numero el cual desea saber si este fue introducido: ");
    num2=poo.nextInt();
    for (int j = 0; j < 10; j++) {
        if (num2==num[j]) {
      posicion=1;
            System.out.println("El numero "+num2+ " Se encuentra en la posicion: "+ (j));
    }
        else{
        posicion=0;
        }
       }
     if (posicion==0) {
      System.out.println("El numero "+ num2 + " no se encuentra en ninguna posicion: -1");  
        }
}
}
