package checkpoint.elsparkesykler.Repository;

import checkpoint.elsparkesykler.Entity.Scooter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScooterRepository extends JpaRepository<Scooter, Long> {
}
