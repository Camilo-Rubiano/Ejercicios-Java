public class Nevera {
    String  temperatura_minima;
    //constructor
    public Nevera( String temperatura_minima,String capacidad, String color, String marca, String consumo_energia){
        super(capacidad, color, marca, consumo_energia);
        this.temperatura_minima =  temperatura_minima;}
    public void producto (String[] cadenas){
        System.out.println("\t***Tienda la Pipa***");
        System.out.println("Eletrodoméstico "+cadenas[1]+" capacidad:" + cadenas[2]+" Kg");
        System.out.println("Color:"+cadenas[3]);
        System.out.println("Marca:"+cadenas[4]);
        System.out.println("consumo_energia: "+cadenas[5]+" kWh/mes");
        System.out.println("temperatura_minima: "+cadenas[6]+" C");
    }
}
