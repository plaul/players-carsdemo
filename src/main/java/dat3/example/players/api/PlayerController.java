package dat3.example.players.api;


import dat3.example.players.entity.Player;
import dat3.example.players.repositories.PlayerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    PlayerRepository playerRepository;

    public PlayerController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @GetMapping
    Iterable<Player> getPlayers() {
        return  playerRepository.findAll();
    }

    @GetMapping("demo1")
    String demo1(){
        return "demo1";
    }

    @GetMapping("demo2")
    String demo2(){
        return "demo1";
    }

    @GetMapping("demo3")
    String demo3(){
        return "demo3";
    }

    @GetMapping("demo4")
    String demo4(){
        return "demo4";
    }
}
