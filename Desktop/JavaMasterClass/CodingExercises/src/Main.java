public class Main {
    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(49.4);
        calculator.setSecondNumber(8.5);

        System.out.println(calculator.getAdditionResult());
        calculator.getAdditionResult();
        calculator.getSubtractionResult();
        calculator.getMultiplicationResult();
        calculator.getDivisionResult();

    }
}