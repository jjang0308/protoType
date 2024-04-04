package EMR.protoType.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "patient")
@Data
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Patient_id;
    private String Patient_name;
    private int age;
    private int height;
    private int weight;

    @Column(unique = true)
    private String user_id;

    @Column(unique = true)
    private String password;

    public Patient(){}


}
