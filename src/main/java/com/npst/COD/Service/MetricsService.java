package com.npst.COD.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npst.COD.Repo.MetricsRepository;

@Service
public class MetricsService {
	
    private final MetricsRepository metricsRepository;

    @Autowired
    public MetricsService(MetricsRepository metricsRepository) {
        this.metricsRepository = metricsRepository;
    }

    // Add methods for managing player metrics
}
