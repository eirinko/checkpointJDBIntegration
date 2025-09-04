package checkpoint.elsparkesykler.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Scooter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private double batteryCapacity;
    private String status; //TODO make this enum??

    @OneToMany(mappedBy = "scooter")
    List<Trip> trips;

    public Scooter() {
    }

    public Scooter(String brand, double batteryCapacity, String status) {
        this.brand = brand;
        this.batteryCapacity = batteryCapacity;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
