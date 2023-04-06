package br.com.carv.pet.model.entity;

import br.com.carv.pet.model.utils.GenericEntity;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_scheduling_date")
public class SchedulingDate extends GenericEntity {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime schedulingDate;

    @ManyToOne(cascade = CascadeType.ALL)
    private Service service;

    @ManyToOne
    private Pet pet;

    public SchedulingDate() {
    }

    public SchedulingDate(LocalDateTime schedulingDate, Service service, Pet pet) {
        this.schedulingDate = schedulingDate;
        this.service = service;
        this.pet = pet;
    }

    public LocalDateTime getSchedulingDate() {
        return schedulingDate;
    }

    public void setSchedulingDate(LocalDateTime schedulingDate) {
        this.schedulingDate = schedulingDate;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
