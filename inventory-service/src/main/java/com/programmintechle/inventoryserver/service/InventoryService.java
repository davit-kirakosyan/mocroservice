package com.programmintechle.inventoryserver.service;

import com.programmintechle.inventoryserver.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    @Transactional
    public boolean isInStock(String skuCode){
        return inventoryRepository.findBySkuCode().isPresent();
    }

}
