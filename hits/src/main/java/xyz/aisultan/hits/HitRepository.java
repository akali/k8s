package xyz.aisultan.hits;

import xyz.aisultan.hits.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HitRepository extends CrudRepository<Hit, Long> {
    public long getCountOfEntities();
}
