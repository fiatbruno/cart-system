package rw.fiat.cartsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rw.fiat.cartsystem.models.Quantity;

import java.util.UUID;

@Repository
public interface IQuantityRepository extends JpaRepository<Quantity, UUID> {
    // Add custom repository methods for quantity management
}
