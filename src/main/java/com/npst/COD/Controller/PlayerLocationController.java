package com.npst.COD.Controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npst.COD.Entity.PlayerLocation;
import com.npst.COD.Service.PlayerLocationService;

@RestController
@RequestMapping("/api/player-locations")
public class PlayerLocationController {
	
    private final PlayerLocationService playerLocationService;

    @Autowired
    public PlayerLocationController(PlayerLocationService playerLocationService) {
        this.playerLocationService = playerLocationService;
    }

    @PostMapping
    public ResponseEntity<Void> savePlayerLocation(@RequestBody PlayerLocationDto playerLocationDto) {
        playerLocationService.savePlayerLocation(
            playerLocationDto.getPlayerId(),
            playerLocationDto.getLatitude(),
            playerLocationDto.getLongitude()
        );
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{playerId}")
    public ResponseEntity<List<PlayerLocationDto>> getPlayerLocations(@PathVariable String playerId) {
        List<PlayerLocation> playerLocations = playerLocationService.getPlayerLocations(playerId);
        List<PlayerLocationDto> playerLocationDtos = playerLocations.stream()
            .map(location -> new PlayerLocationDto(
                location.getPlayerId(),
                location.getLatitude(),
                location.getLongitude(),
                location.getTimestamp()
            ))
            .collect(Collectors.toList());
        return ResponseEntity.ok(playerLocationDtos);
    }
}
