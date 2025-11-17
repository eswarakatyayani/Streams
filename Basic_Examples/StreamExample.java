package Service;


import java.util.*;
import java.util.stream.Collectors;

import model.Product;

class StreamExample {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "HP Laptop", 25000f));
        products.add(new Product(2, "Dell Laptop", 30000f));
        products.add(new Product(3, "Lenovo Laptop", 28000f));
        products.add(new Product(4, "Sony Laptop", 28000f));
        products.add(new Product(5, "Apple Laptop", 90000f));
        
        
        /*      
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() > 30000) {
                filteredProducts.add(product);
            }
        }
        */
        
        List<Product> filteredProducts = products.stream()
                .filter(product -> product.getPrice() > 30000)
                .collect(Collectors.toList());
      
        System.out.println("Products with price greater than 30,000:");
        for (Product f : filteredProducts) {
            System.out.println(f);
        }
    }
}
