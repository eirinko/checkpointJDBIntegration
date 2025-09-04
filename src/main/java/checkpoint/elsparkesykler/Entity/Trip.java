package checkpoint.elsparkesykler.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

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

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private double cost;

    public Trip() {
    }

    public Trip(TripId id, LocalDateTime startTime, LocalDateTime endTime, double cost) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.cost = cost;
    }

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

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
