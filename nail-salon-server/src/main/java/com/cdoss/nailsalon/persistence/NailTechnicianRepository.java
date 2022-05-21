package com.cdoss.nailsalon.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NailTechnicianRepository extends JpaRepository<NailTechnician, Integer> {
}
