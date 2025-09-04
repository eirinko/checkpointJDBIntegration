package checkpoint.elsparkesykler.Entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TripId implements Serializable {
    private Long userId;
    private Long scooterId;

    public TripId(Long userId, Long scooterId) {
        this.userId = userId;
        this.scooterId = scooterId;
    }

    public TripId() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TripId tripId = (TripId) o;
        return Objects.equals(userId, tripId.userId) && Objects.equals(scooterId, tripId.scooterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, scooterId);
    }
}
