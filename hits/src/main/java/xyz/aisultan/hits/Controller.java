package xyz.aisultan.hits;

import org.springframework.web.bind.annotation.*;
import xyz.aisultan.hits.*;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class Controller {
    private final HitService hitService;

    public Controller(HitService hitService) {
        this.hitService = hitService;
    }

    @GetMapping("/health")
    public String getHeath() {
        return "OK";
    }

    @GetMapping("/hit")
    public Hit hit() {
        return hitService.getHits();
    }
}