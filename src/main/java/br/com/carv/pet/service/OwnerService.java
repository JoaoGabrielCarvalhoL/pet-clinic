package br.com.carv.pet.service;

import br.com.carv.pet.model.dto.request.OwnerPostRequest;
import br.com.carv.pet.model.dto.request.OwnerPutRequest;
import br.com.carv.pet.model.dto.response.OwnerGetResponse;
import br.com.carv.pet.model.dto.response.PetGetResponse;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;
import java.util.UUID;

public interface OwnerService {

    OwnerGetResponse findById(UUID id);

    OwnerGetResponse save(OwnerPostRequest ownerPostRequest);

    OwnerGetResponse update(OwnerPutRequest ownerPutRequest);

    void delete(UUID id);

    Page<OwnerGetResponse> findAll(Pageable pageable);

    List<OwnerGetResponse> findAll();

    OwnerGetResponse findByEmail(String email);

    OwnerGetResponse findByLastName(String lastName);

    List<PetGetResponse> allPets(UUID id);
}
