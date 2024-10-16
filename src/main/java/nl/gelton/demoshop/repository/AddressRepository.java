package nl.gelton.demoshop.repository;

import nl.gelton.demoshop.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
