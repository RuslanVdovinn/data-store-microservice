package com.example.datastoremicroservice.web.controller;

import com.example.datastoremicroservice.model.MeasurementType;
import com.example.datastoremicroservice.model.Summary;
import com.example.datastoremicroservice.model.SummaryType;
import com.example.datastoremicroservice.service.SummaryService;
import com.example.datastoremicroservice.web.dto.SummaryDTO;
import com.example.datastoremicroservice.web.mapper.SummaryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/analytics")
@RequiredArgsConstructor
public class AnalyticsController {

    private final SummaryService summaryService;
    private final SummaryMapper summaryMapper;

    @GetMapping("/summary/{sensorId}")
    public SummaryDTO getSummary(
            @PathVariable("sensorId") long sensorId,
            @RequestParam(value = "mt", required = false) Set<MeasurementType> measurementTypes,
            @RequestParam(value = "st", required = false) Set<SummaryType> summaryTypes) {

        Summary summary = summaryService.get(
                sensorId,
                measurementTypes,
                summaryTypes
        );
        return summaryMapper.toDto(summary);
    }
}
