package com.example.datastoremicroservice.web.mapper;

import com.example.datastoremicroservice.model.Summary;
import com.example.datastoremicroservice.web.dto.SummaryDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Primary
public class MyMapper implements SummaryMapper {
    @Override
    public Summary toEntity(SummaryDTO summaryDTO) {
        return null;
    }

    @Override
    public List<Summary> toEntity(List<SummaryDTO> summaryDTOS) {
        return List.of();
    }

    @Override
    public SummaryDTO toDto(Summary summary) {
        SummaryDTO summaryDTO = new SummaryDTO();
        summaryDTO.setSensorId(summary.getSensorId());
        summaryDTO.setValues(summary.getValues());
        return summaryDTO;
    }

    @Override
    public List<SummaryDTO> toDto(List<Summary> summaries) {
        return List.of();
    }
}
