package nivel01.ejercicio01.main.java.com.modules.sales;
import nivel01.ejercicio01.main.java.com.modules.products.Product;
import nivel01.ejercicio01.main.java.com.modules.salebuida.SaleBuidaException;

import java.util.List;

import static java.lang.System.*;

public class Sale {

    private List<Product> products;


    public Sale(List<Product> products) {
        this.products = products;
    }

    public void getTotalPrice() throws SaleBuidaException {
        if (products.isEmpty()) {
            throw new SaleBuidaException();
        }
        double total = 0.0;
        for (Product product : products) {
            total += product.getPrice();
        }
        out.println("Total de la venta: " + total);
    }


}

