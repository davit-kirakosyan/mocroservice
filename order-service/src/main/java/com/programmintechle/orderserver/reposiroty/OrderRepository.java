package com.programmintechle.orderserver.reposiroty;

import com.programmintechle.orderserver.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
