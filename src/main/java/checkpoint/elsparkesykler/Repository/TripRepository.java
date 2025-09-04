package checkpoint.elsparkesykler.Repository;

import checkpoint.elsparkesykler.Entity.Trip;
import checkpoint.elsparkesykler.Entity.TripId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip, TripId> {
}
