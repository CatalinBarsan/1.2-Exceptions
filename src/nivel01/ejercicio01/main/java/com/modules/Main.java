package nivel01.ejercicio01.main.java.com.modules;
import nivel01.ejercicio01.main.java.com.modules.products.Product;
import nivel01.ejercicio01.main.java.com.modules.products.ProductManager;
import nivel01.ejercicio01.main.java.com.modules.salebuida.SaleBuidaException;
import nivel01.ejercicio01.main.java.com.modules.sales.Sale;
import java.util.ArrayList;
import java.util.List;
import static java.lang.System.*;

public class Main {

    public static void main(String[] args) throws SaleBuidaException {

        try {

            ProductManager pm = new ProductManager();
            List<Product> productList = pm.getProducts();

            Sale sale1 = new Sale(productList);
            sale1.getTotalPrice();

            try {
                Product invalidProduct = productList.get(2);
                out.println("Product " + invalidProduct.getName());
            } catch (IndexOutOfBoundsException e) {
                out.println("Error: " + e.getMessage());
                out.println("Index out of bounds.");
            }

            List<Product> productList2 = new ArrayList<>();
            Sale sale2 = new Sale(productList2);

            try {
                sale2.getTotalPrice();
            } catch (SaleBuidaException e) {
                out.println("Error: " + e.getMessage());
            }

        } catch (Exception e) {
            out.println("Unexpected error occurred: " + e.getMessage());
        }

    }
}

