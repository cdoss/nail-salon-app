package com.cdoss.nailsalon.persistence;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "appointment")
public class Appointment {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "nail_technician_id")
    private NailTechnician nailTechnician;

    @Column(name = "time")
    private LocalDateTime time;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NailTechnician getNailTechician() {
        return nailTechnician;
    }

    public void setNailTechician(NailTechnician nailTechnician) {
        this.nailTechnician = nailTechnician;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
