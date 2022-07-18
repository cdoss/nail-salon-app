package com.cdoss.nailsalon.service;

import com.cdoss.nailsalon.persistence.NailTechnician;

import java.util.List;

public interface TechnicianService {
    public List<NailTechnician> getAllTechnicians();
    public NailTechnician saveTechnician(NailTechnician technician);
}
