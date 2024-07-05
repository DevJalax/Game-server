package com.npst.COD.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npst.COD.Service.MetricsService;

@RestController
@RequestMapping("/metrics")
public class MetricsController {
	
    private final MetricsService metricsService;

    @Autowired
    public MetricsController(MetricsService metricsService) {
        this.metricsService = metricsService;
    }

    // Add REST endpoints for querying player metrics
}
