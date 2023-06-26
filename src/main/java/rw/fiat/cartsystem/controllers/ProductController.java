package rw.fiat.cartsystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rw.fiat.cartsystem.models.Product;
import rw.fiat.cartsystem.payload.ApiResponse;
import rw.fiat.cartsystem.services.IProductService;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final IProductService productService;

    @Autowired
    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<ApiResponse> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return ResponseEntity.ok(ApiResponse.success(products));
    }

    @GetMapping("/{code}")
    public ResponseEntity<ApiResponse> getProductByCode(@PathVariable UUID code) {
        Product product = productService.getProductByCode(code);
        return ResponseEntity.ok(ApiResponse.success(product));
    }

    @PostMapping
    public ResponseEntity<ApiResponse> createProduct(@Valid @RequestBody Product product) {
        Product createdProduct = productService.createProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(ApiResponse.success(createdProduct));
    }

    @PutMapping("/{code}")
    public ResponseEntity<ApiResponse> updateProduct(@PathVariable UUID code, @Valid @RequestBody Product product) {
        Product updatedProduct = productService.updateProduct(code, product);
        return ResponseEntity.ok(ApiResponse.success(updatedProduct));
    }

    @DeleteMapping("/{code}")
    public ResponseEntity<ApiResponse> deleteProduct(@PathVariable UUID code) {
        productService.deleteProduct(code);
        return ResponseEntity.ok(ApiResponse.success("Product deleted successfully"));
    }
}
