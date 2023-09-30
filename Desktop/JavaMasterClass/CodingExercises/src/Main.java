public class Main {
    public static void main(String[] args) {
        Floor floor = new Floor(5,2);
        Carpet carpet = new Carpet(5.5);
        Calculator calculator = new Calculator(floor, carpet);

        System.out.println("Total = " + calculator.getTotalCost());

    }
}