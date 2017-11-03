package app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Band{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String bandmaster;

    @Column(nullable = false, unique = true)
    private String bandname;

    @Column(nullable = false)
    private String genre;

    public String getBandmaster() {
        return bandmaster;
    }

    public long getId() {
        return id;
    }
}

