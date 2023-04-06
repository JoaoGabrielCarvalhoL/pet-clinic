package br.com.carv.pet.model.entity;

import br.com.carv.pet.model.enums.PetType;
import br.com.carv.pet.model.utils.GenericEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_pet")
public class Pet extends GenericEntity {

    @Column(nullable = false, length = 100)
    private String petName;

    @Enumerated(EnumType.STRING)
    private PetType petType;

    @ManyToOne
    private Owner owner;

    @OneToMany(mappedBy = "pet")
    private List<SchedulingDate> schedules;

    public Pet() {
    }

    public Pet(String petName, PetType petType, Owner owner) {
        this.petName = petName;
        this.petType = petType;
        this.owner = owner;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public List<SchedulingDate> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<SchedulingDate> schedules) {
        this.schedules = schedules;
    }
}
