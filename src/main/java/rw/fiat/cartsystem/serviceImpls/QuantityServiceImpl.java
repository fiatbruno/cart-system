package rw.fiat.cartsystem.serviceImpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rw.fiat.cartsystem.models.Quantity;
import rw.fiat.cartsystem.repositories.IQuantityRepository;
import rw.fiat.cartsystem.services.IQuantityService;

import java.util.List;
import java.util.UUID;

@Service
public class QuantityServiceImpl implements IQuantityService {

    private final IQuantityRepository quantityRepository;

    @Autowired
    public QuantityServiceImpl(IQuantityRepository quantityRepository) {
        this.quantityRepository = quantityRepository;
    }

    @Override
    public Quantity registerQuantity(Quantity quantity) {
        // Implement the logic to register a quantity
        // Example:
        return quantityRepository.save(quantity);
    }

    @Override
    public Quantity getQuantityById(UUID id) {
        return null;
    }

    @Override
    public List<Quantity> getAllQuantities() {
        return null;
    }

    @Override
    public Quantity createQuantity(Quantity quantity) {
        return null;
    }

    @Override
    public Quantity updateQuantity(UUID id, Quantity quantity) {
        return null;
    }

    @Override
    public void deleteQuantity(UUID id) {

    }

    // Add other methods related to quantity management
}

