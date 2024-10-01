package com.kristian.game_service.service;

import com.kristian.game_service.model.Game;
import com.kristian.game_service.repository.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    public Game addGame(Game game) {
        return gameRepository.save(game);
    }
}
