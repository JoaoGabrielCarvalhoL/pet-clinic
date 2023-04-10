package br.com.carv.pet.service;

import br.com.carv.pet.model.dto.request.PetPostRequest;
import br.com.carv.pet.model.dto.request.PetPutRequest;
import br.com.carv.pet.model.dto.response.PetGetResponse;

import java.util.UUID;

public interface PetService {

    PetGetResponse findById(UUID id);

    PetGetResponse save(PetPostRequest petPostRequest);

    PetGetResponse update(PetPutRequest petPutRequest);

    void delete(UUID id);


}
