package com.cdoss.nailsalon.controller;

import com.cdoss.nailsalon.domain.AppointmentDto;
import com.cdoss.nailsalon.persistence.Appointment;
import com.cdoss.nailsalon.persistence.NailTechnician;
import com.cdoss.nailsalon.service.AppointmentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/appointments")
    public List<AppointmentDto> getAllAppointments(){
        List<AppointmentDto> appointmentDtos = new ArrayList<>();

        List<Appointment> appointments = appointmentService.getAllAppointments();
        if (appointments != null && appointments.size() > 0) {
            for (Appointment appointment : appointments) {
                AppointmentDto dto = convertToDto(appointment);
                appointmentDtos.add(dto);
            }
        }
        return appointmentDtos;
    }

    private AppointmentDto convertToDto(Appointment appointment) {
        AppointmentDto dto = modelMapper.map(appointment, AppointmentDto.class);
        NailTechnician nailTechnician = appointment.getNailTechician();
        String technicianName = nailTechnician.getFirstName() + " " + nailTechnician.getLastName();
        dto.setName(technicianName);
        return dto;
    }
}
