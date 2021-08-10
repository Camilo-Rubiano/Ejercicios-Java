public class Lavadora extends Electrodomestico{
    int programa_lavado;
    double consumo_agua;

    public Lavadora(int capacidad, String color, String marca, double consumo_energia, int programa_lavado, double consumo_agua){
        super(capacidad, color, marca, consumo_energia)
        this.programa_lavado =  programa_lavado;
        this.consumo_agua = consumo_agua;
    }

    public void prueba (){
        System.out.println("Hola mundo");

    }
}
