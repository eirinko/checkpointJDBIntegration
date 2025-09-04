package checkpoint.elsparkesykler.Repository;

import checkpoint.elsparkesykler.Entity.Trip;
import checkpoint.elsparkesykler.Entity.TripId;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TripRepository extends JpaRepository<Trip, TripId> {
    List<Trip> findTripsByUserIdOrderByStartTime(Long userId);
}
