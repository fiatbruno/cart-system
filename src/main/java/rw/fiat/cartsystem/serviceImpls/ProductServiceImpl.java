package rw.fiat.cartsystem.serviceImpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rw.fiat.cartsystem.models.Product;
import rw.fiat.cartsystem.repositories.IProductRepository;
import rw.fiat.cartsystem.services.IProductService;

import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements IProductService {

    private final IProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product registerProduct(Product product) {
        // Implement the logic to register a product
        // Example:
        return productRepository.save(product);
    }

    @Override
    public void registerQuantity(Product product, int quantity) {
        // Implement the logic to register the quantity for a product
        // Example:
        product.setQuantity(quantity);
        productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product updateProduct(UUID code, Product product) {
        return null;
    }

    @Override
    public Product getProductByCode(UUID code) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public void deleteProduct(UUID code) {

    }

    // Add other methods related to product management
}
