package checkpoint.scooter;

import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;

@Entity
public class Trip {
    @IdClass(TripId.class)

}
