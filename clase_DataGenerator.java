Clase DataGenerator.java:


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DataGenerator {

    // Método para crear un archivo de ventas pseudoaleatorio para un vendedor
    public static void createSalesMenFile(int randomSalesCount, String name, long id) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(name + "_" + id + ".txt"))) {
            for (int i = 0; i < randomSalesCount; i++) {
                writer.write(String.format("Product%d;%d\n", i, (int) (Math.random() * 100)));
            }
        }
    }

    // Método para crear un archivo de productos con datos pseudoaleatorios
    public static void createProductsFile(int productsCount) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("products.txt"))) {
            for (int i = 0; i < productsCount; i++) {
                writer.write(String.format("Product%d;Name%d;%.2f\n", i, i, Math.random() * 100));
            }
        }
    }

    // Método para crear un archivo con información de vendedores de forma pseudoaleatoria
