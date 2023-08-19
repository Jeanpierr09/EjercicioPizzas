public class Topping {
    protected String nombre;

    //Constructor de la clase Topping
    public Topping(String nombre){
        this.nombre = nombre;
    }
    //Metodo para agregar un topping a una pizza
    public void agregar(Pizza pizza){
        pizza.agregarTopping(this.nombre);
        System.out.println("Topping " + nombre + " agregado a la pizza ");
    }
}
