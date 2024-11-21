import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CalculatorServer {
    public static void main(String[] args) {
        try {
            // Inicia o registro RMI na porta 2000
            LocateRegistry.createRegistry(2000);

            // Cria a instância do objeto remoto
            CalculatorService calculatorService = new CalculatorServiceImpl();

            // Registra o objeto remoto no RMI Registry na porta 2000
            Naming.rebind("rmi://0.0.0.0:2000/CalculatorService", calculatorService);

            System.out.println("Calculator Server is ready.");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}