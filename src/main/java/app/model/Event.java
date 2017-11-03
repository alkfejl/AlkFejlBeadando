package app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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

    public String getDate() {
        return date;
    }

    public long getId() {
        return id;
    }
}

