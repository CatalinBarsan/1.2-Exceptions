package nivel01.ejercicio01.main.java.com.modules.products;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    public ProductManager() {

    }

    public List<Product> getProducts() {
        List<Product> productArrayList = new ArrayList<>();
        productArrayList.add(new Product("16Gb DDR4 SODIM", 39.90));
        productArrayList.add(new Product("Intel I9 9600K", 249.90));
        return productArrayList;
    }

}
