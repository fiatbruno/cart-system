package rw.fiat.cartsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rw.fiat.cartsystem.models.Purchased;

import java.util.UUID;

@Repository
public interface IPurchasedRepository extends JpaRepository<Purchased, UUID> {
    // Add custom repository methods for purchase management
}
