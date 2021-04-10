package ProyectoP1;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainP1 {
    public static void main(String[] args){
        Scanner poo = new Scanner(System.in);
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
    Proyecto[] datos;
    int n=1;
        System.out.println("TIENDAS LoXXO");
        System.out.print("¿De que tamaño quiere su cartera de clientes?: ");
        n= poo.nextInt();
        
       datos= new Proyecto[n];
       //Se inicializa cada posicion del arreglo
        for (int i = 0; i < datos.length; i++) {
            datos[i]= new Proyecto();
        }
        try{
        for (int i = 0; i < datos.length; i++) {
            System.out.print("Ingresa el codigo del cliente: ");
            datos[i].setCodigoCliente(poo.nextInt());
             System.out.print("Nombre:  ");
            datos[i].setNombre(bf.readLine( ));
             System.out.print("Apellido Paterno:  ");
            datos[i].setApellidoPaterno(bf.readLine());
             System.out.print("Apellido Materno: ");
            datos[i].setApellidoMaterno(bf.readLine());
             System.out.print("Telefono: ");
            datos[i].setTelefono(bf.readLine());
             System.out.print("Direccion:  ");
            datos[i].setDireccion(bf.readLine());
             System.out.print("Edad:  ");
            datos[i].setEdad(poo.nextInt());
            System.out.println("----------------------------------------------");
            System.out.println(" ");
        }
        }
        catch(Exception e){
                System.out.println("El dato introducido no es valido ");
                }
        
       int cant=100;
       int cant2=0;
       int cant3=1;
       String nombre;
while(cant!=4){
    System.out.println("1) Agregar Cliente ");
    System.out.println("2) Mostrar Clientes");
    System.out.println("3) Buscar Cliente");
    System.out.println("4) Salir");
    System.out.println("Elige una opcion: ");
    cant= poo.nextInt();
    System.out.println("----------------------");
    
   switch(cant){
       case 1:
           if(datos.length<n){
            try{
        for (int i = 0; i <= n; i++) {
            System.out.print("Ingresa el codigo del cliente: ");
            datos[i].setCodigoCliente(poo.nextInt());
             System.out.print("Nombre:  ");
            datos[i].setNombre(bf.readLine( ));
             System.out.print("Apellido Paterno:  ");
            datos[i].setApellidoPaterno(bf.readLine());
             System.out.print("Apellido Materno: ");
            datos[i].setApellidoMaterno(bf.readLine());
             System.out.print("Telefono: ");
            datos[i].setTelefono(bf.readLine());
             System.out.print("Direccion:  ");
            datos[i].setDireccion(bf.readLine());
             System.out.print("Edad:  ");
            datos[i].setEdad(poo.nextInt());
            System.out.println(" ");
        }
                System.out.println("----------------------------");
        }
        catch(Exception e){
                System.out.println("El dato introducido no es valido ");
                }
           } else{
               System.out.println("No hay suficiente espacio en la cartera");}
           
           break;
       case 2:
       for (int i = 0; i < datos.length; i++) {
           System.out.println("Codigo Cliente: " + datos[i].getCodigoCliente());
           System.out.println("Nombre: " + datos[i].getNombre());
           System.out.println("Apellido Paterno:  " + datos[i].getApellidoPaterno());
            System.out.println("Apellido Materno: " + datos[i].getApellidoMaterno());
            System.out.println("Telefono: " + datos[i].getTelefono());
            System.out.println("Direccion:  " + datos[i].getDireccion());
            System.out.println("Edad: " + datos[i].getEdad()); 
            System.out.println("----------------------------------------------------");
            System.out.println(" ");
            }
           break;
       case 3:
           
           while(cant2!=3){
               System.out.println("-------Menu Secundario-------");
                    System.out.println("1) Buscar por codigo");
                    System.out.println("2) Buscar por nombre");
                    System.out.println("3) Regresar al menu principal");
                    System.out.print("Elige una opcion: ");
                    cant2= poo.nextInt();
                    System.out.println("--------------------------------");
                    System.out.println(" ");
                    switch(cant2){
                        case 1: 
                                System.out.print("Ingrese el codigo del cliente: ");
                                cant3= poo.nextInt();
                                if (cant3>=0 && cant3<datos.length) {
                                System.out.println("Codigo Cliente: " + datos[cant3].getCodigoCliente());
                                System.out.println("Nombre: " + datos[cant3].getNombre());
                                System.out.println("Apellido Paterno:  " + datos[cant3].getApellidoPaterno());
                                System.out.println("Apellido Materno: " + datos[cant3].getApellidoMaterno());
                                System.out.println("Telefono: " + datos[cant3].getTelefono());
                                System.out.println("Direccion:  " + datos[cant3].getDireccion());
                                System.out.println("Edad: " + datos[cant3].getEdad());
                                 } else{
                                    System.out.println("El codigo que ingreso no existe :( ");
                                }                           
                            break;
                        case 2:
                             try{
                                 System.out.print("Ingrese el nombre del cliente a buscar: ");
                                 nombre=(bf.readLine());
                             boolean nombrecliente=false;
                            for (int i = 0; i < datos.length; i++) {
                              if (nombre.equals(datos[i].getNombre())) {
                                 System.out.println("Codigo Cliente: " + datos[i].getCodigoCliente());
                                System.out.println("Nombre: " + datos[i].getNombre());
                                System.out.println("Apellido Paterno:  " + datos[i].getApellidoPaterno());
                                System.out.println("Apellido Materno: " + datos[i].getApellidoMaterno());
                                System.out.println("Telefono: " + datos[i].getTelefono());
                                System.out.println("Direccion:  " + datos[i].getDireccion());
                                System.out.println("Edad: " + datos[i].getEdad());
                                nombrecliente=true;
                              }
                            }
                           }
                              catch(Exception e){
                                 System.out.println("El dato ingresado no es valido :( ");
                             }
                            
                           
                            break;
                        case 3:
                            System.out.println("Gracias por usar el submenu");
                            break;
                    
                    }
           }
          
           break;
       case 4:
           System.out.println("A salido del programa, que tenga un buen dia");
           break;
   }
}
    }
}
