package com.cdoss.nailsalon.domain;

import java.time.LocalDateTime;

public class AppointmentDto {

    private String name;

    private String nailTechnician;

    private LocalDateTime time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNailTechnician() {
        return nailTechnician;
    }

    public void setNailTechnician(String nailTechnician) {
        this.nailTechnician = nailTechnician;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
