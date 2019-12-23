package ru.bscgrand.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bscgrand.api.Models.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
