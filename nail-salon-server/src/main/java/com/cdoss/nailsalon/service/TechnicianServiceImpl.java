package com.cdoss.nailsalon.service;

import com.cdoss.nailsalon.persistence.NailTechnician;
import com.cdoss.nailsalon.persistence.NailTechnicianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnicianServiceImpl implements TechnicianService {

    @Autowired
    private NailTechnicianRepository nailTechnicianRepository;

    @Override
    public List<NailTechnician> getAllTechnicians() {
        return nailTechnicianRepository.findAll();
    }
}
