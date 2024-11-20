import java.rmi.Naming;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            String host = args.length > 0 ? args[0] : "localhost";
            CalculatorService calculatorService = (CalculatorService) Naming.lookup("rmi://" + host + "/CalculatorService");

            double a = 10.0;
            double b = 5.0;

            System.out.println("Addition: " + calculatorService.add(a, b));
            System.out.println("Subtraction: " + calculatorService.subtract(a, b));
            System.out.println("Multiplication: " + calculatorService.multiply(a, b));
            System.out.println("Division: " + calculatorService.divide(a, b));

        } catch (Exception e) {
            System.err.println("Client exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}