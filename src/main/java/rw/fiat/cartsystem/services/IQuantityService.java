package rw.fiat.cartsystem.services;

import rw.fiat.cartsystem.models.Quantity;

import java.util.List;
import java.util.UUID;

public interface IQuantityService {
    Quantity registerQuantity(Quantity quantity);

    Quantity getQuantityById(UUID id);

    List<Quantity> getAllQuantities();

    Quantity createQuantity(Quantity quantity);

    Quantity updateQuantity(UUID id, Quantity quantity);

    void deleteQuantity(UUID id);
    // Add other methods related to quantity management
}
