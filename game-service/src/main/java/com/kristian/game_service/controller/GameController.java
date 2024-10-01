package com.kristian.game_service.controller;

import com.kristian.game_service.model.Game;
import com.kristian.game_service.service.GameService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameController {
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public List<Game> getAllGames() {
        return gameService.getAllGames();
    }

    @PostMapping
    public Game addGame(@RequestBody Game game) {
        return gameService.addGame(game);
    }
}
