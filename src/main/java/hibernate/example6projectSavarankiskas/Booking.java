package hibernate.example6projectSavarankiskas;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Booking {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer date_from;
    private Integer date_to;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;
    @ManyToOne
    @JoinColumn(name = "guest_id")
    private Guest guest;



}
