package nl.gelton.demoshop.repository;

import nl.gelton.demoshop.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
