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
public class Event{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String date;

    @Column(nullable = false)
    private String clubname;

    @Column(nullable = false)
    private String bandname;

    @OneToMany(targetEntity = Band.class,
            cascade = CascadeType.ALL)
    private List<Band> bandList;

    @OneToOne(targetEntity = Club.class,
            cascade = CascadeType.ALL)
    private Club club;

    public String getDate() {
        return date;
    }

    public long getId() {
        return id;
    }
}

