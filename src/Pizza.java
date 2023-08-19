public class Pizza {
    protected String nombre;
    private double precio; //propiedades de almacenamiento
    private String[] ingredientes;

    //Este es el constructor de la clase pizza
    public Pizza(String nombre, double precio, String[] ingredientes){
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
    }

    public void IngredientesPizza(){
        System.out.println("Ingredientes de la pizza " + nombre + ":");
        for (String ingrediente : ingredientes) {
            System.out.println(ingrediente);}
    }

    //Este es el metodo para simular la creación de la pizza cuando ya está lista completamente
    public void preparar(){
        System.out.println("La pizza: " + nombre + " esta lista para su entrega ");
    }

    //Este es el metodo que se usa para simular el agregado de un Topping a la pizza
    public void agregarTopping(String topping) {
        System.out.println("Agregando topping " + topping + " a la pizza " + nombre + ".");}

    //Metodo para obtener una representación en texto de la pizza
    @Override
    public String toString(){
        return "Nombre de la Pizza: " + nombre + ", y su precio es:  " + precio;
    }

}
