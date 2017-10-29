package hello.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="clubname", nullable=false, length=100)
    private String clubname;

    @Column(name="date", nullable=false, length=100)
    private String date;

    @Column(name="firstband", nullable=false, length=100)
    private String firstband;

    @Column(name="secondband", nullable=false, length=100)
    private String secondband;

    @Column(name="genre", nullable=false, length=100)
    private String genre;

}
