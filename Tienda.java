import Lavadora;
import Nevera;
import Electrodomestico;
import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
    String [] cadena;
    Scanner c = new Scanner(System.in);   
    System.out.println("Ingrese opcion");
    cadena = c.nextLine().split("&");  
    int  opcion = Integer.parseInt(cadena[0]);
    do{
        
    ArrayList<String> productosArrayList = new ArrayList<String>();
     
    System.out.println(cadena.length);  
    if(opcion == 1){
        if ( "Nevera".equals(cadena[1])){
            Nevera  ing_nev = new Nevera( cadena[1], cadena[2], cadena[3], cadena[4], cadena [5]);
            ing_nev.producto(cadena);
        }
        else {            
            Lavadora ing_lav = new Lavadora(cadena[1], cadena[2], cadena[3], cadena[4], cadena [5],cadena [6]);
            ing_lav.producto(cadena);
        }        
    }
    else if(opcion == 2 ){
        System.out.println("2");    
    }
    else{
        System.out.println("3"); 
    }  
    System.out.println("Ingrese opcion");
    cadena = c.nextLine().split("&");  
    int  opcion2 = Integer.parseInt(cadena[0]); 
    }  while (opcion2 == 1);
    
}
}

