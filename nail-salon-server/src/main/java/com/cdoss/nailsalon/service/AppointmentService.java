package com.cdoss.nailsalon.service;

import com.cdoss.nailsalon.persistence.Appointment;

import java.util.List;

public interface AppointmentService {
    public List<Appointment> getAllAppointments();
}
