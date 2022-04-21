package applicationpackage.repositories;

import applicationpackage.data.Groceries;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroceriesRepository extends JpaRepository<Groceries, Integer> {
    List<Groceries> findByName(String name);
}

