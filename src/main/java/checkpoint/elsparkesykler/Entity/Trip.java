package checkpoint.elsparkesykler.Entity;

import jakarta.persistence.*;

@Entity
public class Trip {
    @EmbeddedId
    private TripId id = new TripId();

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @MapsId("scooterId")
    @JoinColumn(name = "scooter_id")
    private Scooter scooter;

    public TripId getId() {
        return id;
    }

    public void setId(TripId id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Scooter getScooter() {
        return scooter;
    }

    public void setScooter(Scooter scooter) {
        this.scooter = scooter;
    }
}
