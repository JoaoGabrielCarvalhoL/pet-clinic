package br.com.carv.pet.model.entity;

import br.com.carv.pet.model.utils.Address;
import br.com.carv.pet.model.utils.Contact;
import br.com.carv.pet.model.utils.Person;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_employee")
public class Employee extends Person {

    @Column(nullable = false, length = 11)
    private String individualCertificate;

    @Column(nullable = false, length = 100)
    private String office;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDate admission;

    private LocalDate dismissal;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Speciality> specialities = new HashSet<Speciality>();

    public Employee() {
    }

    public Employee(String firstName, String lastName, String email, Address address, Contact contact,
                    String individualCertificate, String office, LocalDate admission) {
        super(firstName, lastName, email, address, contact);
        this.individualCertificate = individualCertificate;
        this.office = office;
        this.admission = admission;
    }


    public Employee(String firstName, String lastName, String email, Address address, Contact contact,
                    String individualCertificate, String office, LocalDate admission, Set<Speciality> specialities) {
        super(firstName, lastName, email, address, contact);
        this.individualCertificate = individualCertificate;
        this.office = office;
        this.admission = admission;
        this.specialities = specialities;
    }

    public String getIndividualCertificate() {
        return individualCertificate;
    }

    public void setIndividualCertificate(String individualCertificate) {
        this.individualCertificate = individualCertificate;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public LocalDate getAdmission() {
        return admission;
    }

    public void setAdmission(LocalDate admission) {
        this.admission = admission;
    }

    public LocalDate getDismissal() {
        return dismissal;
    }

    public void setDismissal(LocalDate dismissal) {
        this.dismissal = dismissal;
    }

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
