package rw.fiat.cartsystem.serviceImpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rw.fiat.cartsystem.models.Purchased;
import rw.fiat.cartsystem.repositories.IPurchasedRepository;
import rw.fiat.cartsystem.services.IPurchasedService;

import java.util.List;
import java.util.UUID;

@Service
public class PurchasedServiceImpl implements IPurchasedService {

    private final IPurchasedRepository purchasedRepository;

    @Autowired
    public PurchasedServiceImpl(IPurchasedRepository purchasedRepository) {
        this.purchasedRepository = purchasedRepository;
    }

    @Override
    public Purchased checkout() {
        // Implement the logic to perform the checkout
        // Example:
        // Calculate the total price based on the purchased items
        // Save the purchase information in the purchasedRepository
        // Return the Purchased object
        return null;
    }

    @Override
    public List<Purchased> getAllPurchases() {
        return null;
    }

    @Override
    public Purchased createPurchased(Purchased purchased) {
        return null;
    }

    @Override
    public Purchased getPurchasedById(UUID id) {
        return null;
    }

    @Override
    public Purchased updatedPurchased(UUID id, Purchased purchased) {
        return null;
    }

    @Override
    public void deletePurchased(UUID id) {

    }

    // Add other methods related to purchase management
}

