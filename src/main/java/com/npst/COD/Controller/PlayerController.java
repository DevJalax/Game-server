package com.npst.COD.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npst.COD.Entity.Player;
import com.npst.COD.Service.PlayerService;

@RestController
@RequestMapping("/players")
public class PlayerController {
	
    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping("/{id}/respawn")
    public ResponseEntity<Player> respawnPlayer(@PathVariable Long id) {
        Player player = playerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Player not found"));

        if (player.getRespawnTime() > System.currentTimeMillis()) {
            return ResponseEntity.status(HttpStatus.TOO_EARLY)
                    .body(player);
        }

        Player respawnedPlayer = playerService.respawnPlayer(player);
        return ResponseEntity.ok(respawnedPlayer);
    }
}
