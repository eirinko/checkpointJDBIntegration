package checkpoint.elsparkesykler.Service;

import checkpoint.elsparkesykler.Entity.Scooter;
import checkpoint.elsparkesykler.Entity.Trip;
import checkpoint.elsparkesykler.Entity.User;
import checkpoint.elsparkesykler.Repository.ScooterRepository;
import checkpoint.elsparkesykler.Repository.TripRepository;
import checkpoint.elsparkesykler.Repository.UserRepository;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class TripService {
    private final TripRepository tripRepository;
    private final ScooterRepository scooterRepository;
    private final UserRepository userRepository;

    public TripService(TripRepository tripRepository, ScooterRepository scooterRepository, UserRepository userRepository) {
        this.tripRepository = tripRepository;
        this.scooterRepository = scooterRepository;
        this.userRepository = userRepository;
    }

    //Finne alle scootere som er ledige og har batteriprosent over 20.
    public List<Scooter> findAvailableScootersWithBatteryCapacityGreaterThan20 () {
        return scooterRepository.findScootersByStatusEqualsAndBatteryCapacityGreaterThan("Available",20);
    }

    //Hente alle turer for en bestemt bruker, sortert etter starttidspunkt.

            //Regne ut gjennomsnittlig pris per km for alle turer.
            //Finne hvilken bruker som har kjørt flest turer.

}
