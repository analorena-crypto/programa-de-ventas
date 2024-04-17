public class Product {
    private String productId;
    private String name;
    private double price;

    // Constructor para inicializar un producto con su ID, nombre y precio
    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters para acceder a los atributos de la clase
    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
