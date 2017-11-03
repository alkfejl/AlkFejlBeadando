package app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Club{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String clubmaster;

    @Column(nullable = false, unique = true)
    private String clubname;

    @Column(nullable = false)
    private String genre;

    @OneToMany(targetEntity = Band.class,
            cascade = CascadeType.ALL)
    private List<Band> bandList;

    @OneToMany(targetEntity = Event.class,
            cascade = CascadeType.ALL)
    private List<Event> eventList;

    public String getClubmaster() {
        return clubmaster;
    }

    public long getId() {
        return id;
    }
}

