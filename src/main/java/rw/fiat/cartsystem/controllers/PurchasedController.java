package rw.fiat.cartsystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rw.fiat.cartsystem.models.Purchased;
import rw.fiat.cartsystem.payload.ApiResponse;
import rw.fiat.cartsystem.services.IPurchasedService;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/purchases")
public class PurchasedController {

    private final IPurchasedService purchasedService;

    @Autowired
    public PurchasedController(IPurchasedService purchasedService) {
        this.purchasedService = purchasedService;
    }

    @GetMapping
    public ResponseEntity<ApiResponse> getAllPurchaseds() {
        List<Purchased> purchases = purchasedService.getAllPurchases();
        return ResponseEntity.ok(ApiResponse.success(purchases));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse> getPurchasedById(@PathVariable UUID id) {
        Purchased purchased = purchasedService.getPurchasedById(id);
        return ResponseEntity.ok(ApiResponse.success(purchased));
    }

    @PostMapping
    public ResponseEntity<ApiResponse> createPurchased(@Valid @RequestBody Purchased purchased) {
        Purchased createdPurchased = purchasedService.createPurchased(purchased);
        return ResponseEntity.status(HttpStatus.CREATED).body(ApiResponse.success(createdPurchased));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse> updatePurchased(@PathVariable UUID id, @Valid @RequestBody Purchased purchased) {
        Purchased updatedPurchased = purchasedService.updatedPurchased(id, purchased);
        return ResponseEntity.ok(ApiResponse.success(updatedPurchased));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse> deletePurchased(@PathVariable UUID id) {
        purchasedService.deletePurchased(id);
        return ResponseEntity.ok(ApiResponse.success("Purchased deleted successfully"));
    }
}

