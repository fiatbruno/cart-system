package rw.fiat.cartsystem.services;

import rw.fiat.cartsystem.models.Product;

import java.util.List;
import java.util.UUID;

public interface IProductService {
    Product registerProduct(Product product);
    void registerQuantity(Product product, int quantity);

    List<Product> getAllProducts();

    Product updateProduct(UUID code, Product product);

    Product getProductByCode(UUID code);

    Product createProduct(Product product);

    void deleteProduct(UUID code);
    // Add other methods related to product management
}
