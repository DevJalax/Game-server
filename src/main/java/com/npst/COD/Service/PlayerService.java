package com.npst.COD.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npst.COD.Entity.Player;
import com.npst.COD.Repo.PlayerRepository;

@Service
public class PlayerService {
	
    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Player respawnPlayer(Player player) {
        player.setX(generateRandomX());
        player.setY(generateRandomY());
        player.setRespawnTime(System.currentTimeMillis() + 60000); // Respawn time set to 1 minute from now
        return playerRepository.save(player);
    }

    private double generateRandomX() {
        // Generate a random X coordinate within a specified range
        return Math.random() * 1000;
    }

    private double generateRandomY() {
        // Generate a random Y coordinate within a specified range
        return Math.random() * 1000;
    }
}
