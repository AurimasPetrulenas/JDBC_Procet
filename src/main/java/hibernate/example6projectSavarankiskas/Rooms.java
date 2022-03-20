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
public class Rooms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer room_id;

    private String room_type;
    private Integer price;
    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;



}
