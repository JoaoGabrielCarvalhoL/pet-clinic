package br.com.carv.pet.model.utils;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

    @Column(nullable = false, length = 100)
    private String publicPlace;
    @Column(nullable = false, length = 20)
    private String houseNumber;

    @Column(nullable = true, length = 50)
    private String complement;

    @Column(nullable = false, length = 100)
    private String district;

    @Column(nullable = false, length = 100)
    private String uf;

    @Column(nullable = false, length = 150)
    private String city;

    @Column(length = 10)
    private String cep;

    public Address() {
    }

    public Address(String publicPlace, String houseNumber, String complement, String district,
                   String  uf, String city, String cep) {
        this.publicPlace = publicPlace;
        this.houseNumber = houseNumber;
        this.complement = complement;
        this.district = district;
        this.uf = uf;
        this.city = city;
        this.cep = cep;
    }

    public String getPublicPlace() {
        return publicPlace;
    }

    public void setPublicPlace(String publicPlace) {
        this.publicPlace = publicPlace;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
