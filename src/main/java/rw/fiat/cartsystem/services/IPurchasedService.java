package rw.fiat.cartsystem.services;

import rw.fiat.cartsystem.models.Purchased;

import java.util.List;
import java.util.UUID;

public interface IPurchasedService {
    Purchased checkout();

    List<Purchased> getAllPurchases();

    Purchased createPurchased(Purchased purchased);

    Purchased getPurchasedById(UUID id);

    Purchased updatedPurchased(UUID id, Purchased purchased);

    void deletePurchased(UUID id);
    // Add other methods related to purchase management
}
