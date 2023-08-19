// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Pizza pizzaMargarita = new Pizza("Pizza Margarita", 60, new String[]{"queso","Tomate"});
        PizzaItaliana pizzaPeperoni = new PizzaItaliana("Pizza Peperoni", 70, new String[]{"Queso", "Peperoni" , "Tomate"}, "Picante.", 15);
        Topping nuevoTopping = new Topping("champiñones");
        Topping nuevoTopping2 = new Topping("Piña");



        System.out.println(pizzaPeperoni);
        pizzaPeperoni.IngredientesPizza();
        nuevoTopping.agregar(pizzaPeperoni);
        pizzaPeperoni.preparar();

        System.out.println(pizzaMargarita);
        nuevoTopping2.agregar(pizzaMargarita);
        pizzaMargarita.preparar();

        }

    }
