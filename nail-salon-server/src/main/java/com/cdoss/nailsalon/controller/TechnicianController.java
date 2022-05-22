package com.cdoss.nailsalon.controller;

import com.cdoss.nailsalon.domain.TechnicanDto;
import com.cdoss.nailsalon.persistence.NailTechnician;
import com.cdoss.nailsalon.service.TechnicianService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TechnicianController {

    @Autowired
    private TechnicianService technicianService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/technicians")
    public List<TechnicanDto> getAllTechnicians() {
        List<TechnicanDto> technicianDtos = new ArrayList<TechnicanDto>();
        List<NailTechnician> nailTechnicians = technicianService.getAllTechnicians();
        if (nailTechnicians != null && nailTechnicians.size() > 0) {
            for (NailTechnician technician : nailTechnicians) {
                TechnicanDto dto = convertToDomain(technician);
                technicianDtos.add(dto);
            }
        }
        return technicianDtos;
    }

    private TechnicanDto convertToDomain(NailTechnician technician) {
        TechnicanDto dto = modelMapper.map(technician, TechnicanDto.class);
        return dto;
    }
}
