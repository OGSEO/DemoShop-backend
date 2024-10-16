package nl.gelton.demoshop.repository;

import nl.gelton.demoshop.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
