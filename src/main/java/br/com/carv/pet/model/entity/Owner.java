package br.com.carv.pet.model.entity;

import br.com.carv.pet.model.utils.Address;
import br.com.carv.pet.model.utils.Contact;
import br.com.carv.pet.model.utils.Person;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_owner")
public class Owner extends Person {

    @OneToMany(mappedBy = "owner", cascade = { CascadeType.REMOVE, CascadeType.PERSIST }, fetch = FetchType.EAGER)
    private Set<Pet> pets = new HashSet<Pet>();

    public Owner() {
    }

    public Owner(String firstName, String lastName, String email, Address address, Contact contact) {
        super(firstName, lastName, email, address, contact);
    }

    public Owner(String firstName, String lastName, String email, Address address, Contact contact,
                 Set<Pet> pets) {
        super(firstName, lastName, email, address, contact);
        this.pets = pets;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}

