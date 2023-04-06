package br.com.carv.pet.model.entity;

import br.com.carv.pet.model.utils.GenericEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_service")
public class Service extends GenericEntity {

    @Column(nullable = false, length = 100)
    private String descriptionService;

    @Column(nullable = false, precision = 8, scale = 2)
    private BigDecimal unitPrice;

    public Service(){
    }

    public Service(String descriptionService, BigDecimal unitPrice) {
        this.descriptionService = descriptionService;
        this.unitPrice = unitPrice;
    }

    public String getDescriptionService() {
        return descriptionService;
    }

    public void setDescriptionService(String descriptionService) {
        this.descriptionService = descriptionService;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
}
