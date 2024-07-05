package com.npst.COD.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.npst.COD.Entity.PlayerMetrics;

@Repository
public interface MetricsRepository extends JpaRepository<PlayerMetrics, Long> {
	
}
