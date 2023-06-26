package rw.fiat.cartsystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rw.fiat.cartsystem.models.Quantity;
import rw.fiat.cartsystem.payload.ApiResponse;
import rw.fiat.cartsystem.services.IQuantityService;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/quantities")
public class QuantityController {

    private final IQuantityService quantityService;

    @Autowired
    public QuantityController(IQuantityService quantityService) {
        this.quantityService = quantityService;
    }

    @GetMapping
    public ResponseEntity<ApiResponse> getAllQuantities() {
        List<Quantity> quantities = quantityService.getAllQuantities();
        return ResponseEntity.ok(ApiResponse.success(quantities));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse> getQuantityById(@PathVariable UUID id) {
        Quantity quantity = quantityService.getQuantityById(id);
        return ResponseEntity.ok(ApiResponse.success(quantity));
    }

    @PostMapping
    public ResponseEntity<ApiResponse> createQuantity(@Valid @RequestBody Quantity quantity) {
        Quantity createdQuantity = quantityService.createQuantity(quantity);
        return ResponseEntity.status(HttpStatus.CREATED).body(ApiResponse.success(createdQuantity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse> updateQuantity(@PathVariable UUID id, @Valid @RequestBody Quantity quantity) {
        Quantity updatedQuantity = quantityService.updateQuantity(id, quantity);
        return ResponseEntity.ok(ApiResponse.success(updatedQuantity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse> deleteQuantity(@PathVariable UUID id) {
        quantityService.deleteQuantity(id);
        return ResponseEntity.ok(ApiResponse.success("Quantity deleted successfully"));
    }
}

