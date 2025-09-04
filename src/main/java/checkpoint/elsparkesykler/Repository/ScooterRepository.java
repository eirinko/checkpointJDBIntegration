package checkpoint.elsparkesykler.Repository;

import checkpoint.elsparkesykler.Entity.Scooter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ScooterRepository extends JpaRepository<Scooter, Long> {
    List<Scooter> findScootersByStatusEqualsAndBatteryCapacityGreaterThan(String status, double capacity);
}
