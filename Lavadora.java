public class Lavadora extends Electrodomestico{
    String programa_lavado, consumo_agua;
    public Lavadora(String capacidad, String color, String marca, String consumo_energia, String programa_lavado, String consumo_agua){
        super(capacidad, color, marca, consumo_energia);
        this.programa_lavado =  programa_lavado;
        this.consumo_agua = consumo_agua;
    }
    public void producto (String[] cadenas){
        System.out.println("\t***Tienda la Pipa***");
        System.out.println("Eletrodoméstico "+cadenas[1]+" capacidad:" + cadenas[2]+" Kg");
        System.out.println("Color:"+cadenas[3]);
        System.out.println("Marca:"+cadenas[4]);
        System.out.println("consumo_energia: "+cadenas[5]+" kWh/mes");
        System.out.println("program_lavado: "+cadenas[6]);
        System.out.println("consumo_agua: "+cadenas[7]);
    }
}
