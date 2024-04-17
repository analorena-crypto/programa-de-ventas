import java.util.HashMap;
import java.util.Map;

public class Salesman {
    private String documentType;
    private String documentNumber;
    private String firstName;
    private String lastName;
    private Map<String, Integer> sales; // Diccionario para almacenar ventas por ID de producto y cantidad vendida

    // Constructor para inicializar un vendedor con sus datos personales
    public Salesman(String documentType, String documentNumber, String firstName, String lastName) {
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sales = new HashMap<>();
    }

    // Métodos para manejar el diccionario de ventas
    public void addSale(String productId, int quantity) {
        sales.put(productId, sales.getOrDefault(productId, 0) + quantity);
    }

    public Map<String, Integer> getSales() {
        return sales;
    }
}
