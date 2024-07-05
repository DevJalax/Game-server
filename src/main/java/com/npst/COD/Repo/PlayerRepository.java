package com.npst.COD.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.npst.COD.Entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    // Custom query methods if needed
}
