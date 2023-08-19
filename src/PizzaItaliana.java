public class PizzaItaliana extends Pizza{
    private String salsa;
    private int tiempohorno;

    //Constructor de la clase Italiana
    public PizzaItaliana(String nombre, double precio, String[] ingredientes, String salsa, int tiempohorno){
        super(nombre, precio, ingredientes);
        this.salsa = salsa;
        this.tiempohorno = tiempohorno;
    }
    //Metodo para preparar la pizza italiana con sobreescritura

    @Override
    public void preparar(){
        System.out.println("Agregando salsa " + salsa + " a la pizza " + nombre + ".");
        System.out.println("La pizza ha sido colocada en el horno durante: " + tiempohorno +" minutos");
        super.preparar();
    }
    //Metodo para mostrar los detalles de la pizza italiana
    @Override
    public String toString(){
     return super.toString() + " Salsa: " + salsa + " Tiempo en el horno: " + tiempohorno;
    }

}
