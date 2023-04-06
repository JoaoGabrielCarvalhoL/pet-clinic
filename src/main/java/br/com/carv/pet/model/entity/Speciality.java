package br.com.carv.pet.model.entity;

import br.com.carv.pet.model.utils.GenericEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_speciality")
public class Speciality extends GenericEntity {

    @Column(nullable = false, length = 100)
    private String specialityName;

    @ManyToOne
    private Employee employee;

    public Speciality() {
    }

    public Speciality(String specialityName, Employee employee) {
        this.specialityName = specialityName;
        this.employee = employee;
    }

    public String getSpecialityName() {
        return specialityName;
    }

    public void setSpecialityName(String specialityName) {
        this.specialityName = specialityName;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
