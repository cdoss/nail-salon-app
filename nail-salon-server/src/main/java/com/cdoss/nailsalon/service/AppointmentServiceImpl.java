package com.cdoss.nailsalon.service;

import com.cdoss.nailsalon.persistence.Appointment;
import com.cdoss.nailsalon.persistence.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }
}
