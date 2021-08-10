import Lavadora;
import Nevera;
import Electrodomestico;
import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
    String [] cadena;
    Scanner c = new Scanner(System.in);   
    System.out.println("Ingrese un numero");
    cadena = c.nextLine().split("&");    
    //int seleccion  = Integer.parseInt(cadena[0]);
    //String producto  = cadena[1];
    ///System.out.println(producto);
    //System.out.println(seleccion);
    Nevera  prod = new Nevera( cadena[1], cadena[2], cadena[3], cadena[4], cadena [5]);
    prod.producto(cadena);

   /*if (( seleccion == 1) && (producto == "Lavadora")){
        System.out.println("1");
    }

    else if(( seleccion == 1) && (producto == "Nevera")){
        System.out.println("2");
    }

    else {
        System.out.println("no funciona");
    } */   
 }
    
}

