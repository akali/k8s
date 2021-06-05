package xyz.aisultan.hits;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import xyz.aisultan.hits.*;

@Service
public class HitService {
    private final HitRepository hitRepository;

    public HitService(HitRepository hitRepository) {
        this.hitRepository = hitRepository;
    }

    public Hit getHits() {
        Hit hit = new Hit();
        hit.setHitCount(hitRepository.getCountOfEntities());
        hitRepository.save(hit);
        return hit;
    }
}