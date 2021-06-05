package xyz.aisultan.hits;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import lombok.Data;

@Data
@Entity
public class Hit {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDateTime hitTime;
    private Long hitCount;

    public Hit() {
        this.hitTime = LocalDateTime.now();
    }
}
