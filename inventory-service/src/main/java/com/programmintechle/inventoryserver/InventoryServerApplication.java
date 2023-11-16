package com.programmintechle.inventoryserver;

import com.programmintechle.inventoryserver.model.Inventory;
import com.programmintechle.inventoryserver.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServerApplication.class, args);
	}

    @Bean
    public CommandLineRunner lineRunner(InventoryRepository inventoryRepository){
        return args -> {
            Inventory inventory = Inventory.builder()
                    .skuCode("iphone_13")
                    .quantity(100)
                    .build();

            Inventory inventory1 = Inventory.builder()
                    .skuCode("iphone_13_red")
                    .quantity(0)
                    .build();

            inventoryRepository.save(inventory);
            inventoryRepository.save(inventory1);
        };
    }
}
