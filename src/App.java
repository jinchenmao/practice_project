public class App {
    public static void main(String[] args) throws Exception {
        // Create a LuckinCoffee object
        LuckinCoffee luckcoffee = new LuckinCoffee();

        // Accept an order
        luckcoffee.takeOrder("1234", "2 lattes", 20.00);
    }
}