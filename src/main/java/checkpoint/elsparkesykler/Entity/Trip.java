package checkpoint.elsparkesykler.Entity;

import jakarta.persistence.*;

@Entity
public class Trip {
    @EmbeddedId
    private TripId id;


/*    @EmbeddedId
    EksamenId eksamenId;

    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "snr")
    private Student student;

    @ManyToOne
    @MapsId("fagId")
    @JoinColumn(name = "fnr")
    Fag fag;*/
}
