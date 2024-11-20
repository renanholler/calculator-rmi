import java.rmi.Naming;

public class ServiceFactory {
    public static CalculatorService getCalculatorService(String host) {
        try {
            return (CalculatorService) Naming.lookup("rmi://" + host + "/CalculatorService");
        } catch (Exception e) {
            System.err.println("Service lookup exception: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}