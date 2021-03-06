package Practica3;
import java.util.Scanner;
public class MetodoMain3 {
   
    public static void main (String[] args){
    Scanner gaby = new Scanner(System.in);
    int nnum[];
    int n;
    int alinear;
    
        System.out.println(" INGRESAR NUMEROS Y ORDENAR DE MENOR A MAYOR ");
        System.out.print("¿Cuantos numeros desea ingresar?: ");
            n=gaby.nextInt();
             nnum = new int[n];
             
             //Se pide al usuario ingresar los numeros 
             for (int i = 0; i < n; i++) {
             System.out.print("Ingrese un numero: ");
             nnum[i]=gaby.nextInt();
        }
             //proceso de ordenamiento conocido como el metodo de la burbuja
                for (int i = 0; i < (n-1); i++) {
                    for (int j = 0; j < (n-1); j++) {
                         if (nnum[j]>nnum[j+1]) {
                               alinear = nnum[j];
                                    nnum[j]= nnum[j+1];
                                        nnum[j+1] = alinear;
                            }
                    }
            }
          //Se imprimen los numeros de forma ordenada 
         System.out.println();
          System.out.println("NUMEROS ORDENADOS  ");
                for (int g = 0; g < n; g++) {
                       System.out.print( nnum[g]+ ", ");
        }
    }
}
