package be.techfix.creche.model;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Entity
@Table(name = "BABY_INFO")
public class Baby {
    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID identifier;
    @Getter
    private String name;
    @Getter
    private String age;
    @Getter
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Getter
    private LocalDateTime lastUpdate;

    public Baby(String name, String age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.lastUpdate = LocalDateTime.now();
    }

    public enum Gender {M, F}
}
