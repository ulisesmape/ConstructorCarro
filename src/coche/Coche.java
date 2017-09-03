package coche;

/**Constructor coche con parámetros vacíos y lleno*/
public class Coche {
    
    /**Se declara que el nivel de gasolina está vacío*/
    private double gasolina = 0;
    
    /**Se indica que el tanque de gasolina contiene la gasolina*/
    Coche(double gasolina){
        this.gasolina = gasolina;
    }
    
    /**Se indica que desde un inicio el coche no tiene gasolina*/
    Coche (){
        System.out.println("El coche no tiene gasolina");
    }
    
    /**Se inicia el método para arrancar*/
    public void arrancar(){
        if (0<gasolina){
            /**Se indica que si la gasolina es suficiente alcanza para alcanzar*/
            if (gasolina <=50){
                System.out.println("El coche arrancó");
            }
            /**Se indica que la gasolina está por terminarse*/
            else {
                System.out.println("En el trayecto se puede terminar la gasolina");
            }
        }
        /**Se indica que el coche no tiene gasolina*/
        else{
            System.out.println("El coche no tiene gasolina");
        }
    }
}
