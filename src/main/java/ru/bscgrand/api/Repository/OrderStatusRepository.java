package ru.bscgrand.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bscgrand.api.Models.OrderStatus;

public interface OrderStatusRepository extends JpaRepository<OrderStatus, Long> {
}
