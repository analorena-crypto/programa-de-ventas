import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    // Método para leer un archivo de productos y devolver una lista de Product
    public static List<Product> readProducts(String filePath) throws IOException {
        List<Product> products = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(";");
                products.add(new Product(data[0], data[1], Double.parseDouble(data[2])));
            }
        }
        return products;
    }

    // Método para leer un archivo con información de vendedores y devolver una lista de Salesman
    public static List<Salesman> readSalesmenInfo(String filePath) throws IOException {
        List<Salesman> salesmen = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(";");
                salesmen.add(new Salesman(data[0], data[1], data[2], data[3]));
            }
        }
        return salesmen;
    }

    // Método para escribir un archivo CSV con la información de los vendedores
    public static void writeSalesReport(List<Salesman> salesmen, String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Salesman s : salesmen) {
                writer.write(String.format("%s;%s;%s;%s\n", s.getDocumentType(), s.getDocumentNumber(), s.getFirstName(), s.getLastName()));
            }
        }
    }

    
}
