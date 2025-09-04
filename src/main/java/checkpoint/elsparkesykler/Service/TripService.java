package checkpoint.elsparkesykler.Service;

import checkpoint.elsparkesykler.Repository.ScooterRepository;
import checkpoint.elsparkesykler.Repository.TripRepository;
import checkpoint.elsparkesykler.Repository.UserRepository;
import org.springframework.stereotype.Component;

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


}
