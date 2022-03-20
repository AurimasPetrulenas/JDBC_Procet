package hibernate.example6projectSavarankiskas;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hotel_id;

    private String hotel_name;
    private Integer address;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Rooms> rooms;


}
