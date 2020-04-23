package com.cg.inventoryservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.inventoryservice.entities.InventoryItem;

import java.util.Optional;

public interface InventoryItemRepository extends JpaRepository<InventoryItem, Long> {

    Optional<InventoryItem> findByProductCode(String productCode);
}
