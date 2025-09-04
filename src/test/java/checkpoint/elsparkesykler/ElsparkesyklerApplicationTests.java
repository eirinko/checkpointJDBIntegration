package checkpoint.elsparkesykler;

import checkpoint.elsparkesykler.Service.TripService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ElsparkesyklerApplicationTests {

    @Autowired
    TripService tripService;

    @Test
    void contextLoads() {
    }

}
