import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CalculatorServer {
    public static void main(String[] args) {
        try {
            // Inicia o registro RMI na porta 1099
            LocateRegistry.createRegistry(1099);

            // Cria a instância do objeto remoto
            CalculatorService calculatorService = new CalculatorServiceImpl();

            // Registra o objeto remoto no RMI Registry
            Naming.rebind("CalculatorService", calculatorService);

            System.out.println("Calculator Server is ready.");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}