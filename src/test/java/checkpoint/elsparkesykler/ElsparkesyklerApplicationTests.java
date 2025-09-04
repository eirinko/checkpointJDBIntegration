package checkpoint.elsparkesykler;

import checkpoint.elsparkesykler.Entity.Scooter;
import checkpoint.elsparkesykler.Entity.Trip;
import checkpoint.elsparkesykler.Entity.TripId;
import checkpoint.elsparkesykler.Entity.User;
import checkpoint.elsparkesykler.Repository.ScooterRepository;
import checkpoint.elsparkesykler.Repository.TripRepository;
import checkpoint.elsparkesykler.Repository.UserRepository;
import checkpoint.elsparkesykler.Service.TripService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ElsparkesyklerApplicationTests {

    @Autowired
    TripService tripService;

    @Autowired
    ScooterRepository scooterRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    TripRepository tripRepository;

    @BeforeEach
    void setUp() {
        Scooter scoot1 = scooterRepository.save(new Scooter("Voi", 85.2,"Available"));
        Scooter scoot2 = scooterRepository.save(new Scooter("Tier", 12.4,"Available"));
        Scooter scoot3 = scooterRepository.save(new Scooter("Tier", 25.4,"In Use"));

        scooterRepository.flush();

        User user1 = userRepository.save(new User("Gnome", "33333333"));
        User user2 = userRepository.save(new User("Roller", "12345678"));

        userRepository.flush();

        //TripId tripid = new TripId(user1.getId(), scoot1.getId());
        //Trip trip1 = tripRepository.save(new Trip(tripid, LocalDateTime.of(2025,6,1,12,1), LocalDateTime.of(2025, 6,1,13,10),80.0));
    }

    @Test
    void contextLoads() {
    }

    @Test
    void testAvailableScootersWithCapacityGreaterThan20Is1() {
        List<Scooter> scooters = tripService.findAvailableScootersWithBatteryCapacityGreaterThan20();
        
        assertEquals(1,scooters.size());
    }
}
