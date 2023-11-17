package com.programmintechle.inventoryservice;

import com.programmintechle.inventoryservice.model.Inventory;
import com.programmintechle.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
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
