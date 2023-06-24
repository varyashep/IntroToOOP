package Seminar1;

import java.util.List;
import java.util.ArrayList;

public abstract class Vending {
    
    private final List<Product> list;

    public Vending() {
        list = new ArrayList<>();
    }

    void addProduct(Product product) {
        list.add(product);
    }

    Product getProduct(String name) {
         for (Product product : list) {
            if (name.equals(product.getKind())) {
                return product;
            }
         }
         return null;
    }

    Product getProduct(Long id) {
        for (Product product : list) {
            if (id.equals(product.getId())) {
                return product;
            }
        }
        return null;
    }

    public List<Product> getList() {
        return list;
    }

}
