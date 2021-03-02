package Practica1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Practica1G {
    private List list = new ArrayList();
    Scanner sc = new Scanner (System.in);
    
    public void Piramide1(int num){
        System.out.print("¿Cuantas filas desea tener? ");
        num=sc.nextInt();
    for(int i=0; i<num; i++){
        list.add("*");
            System.out.println(list);
    }
  }
}
