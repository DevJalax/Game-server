package com.npst.COD.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Player {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String username;
    
    @ManyToOne
    private Game game;
    
    @OneToOne(mappedBy = "player", cascade = CascadeType.ALL)
    private PlayerMetrics metrics;
    
    private long respawnTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public PlayerMetrics getMetrics() {
		return metrics;
	}

	public void setMetrics(PlayerMetrics metrics) {
		this.metrics = metrics;
	}

	public long getRespawnTime() {
		return respawnTime;
	}

	public void setRespawnTime(long respawnTime) {
		this.respawnTime = respawnTime;
	}
}
