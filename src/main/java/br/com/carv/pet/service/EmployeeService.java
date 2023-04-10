package br.com.carv.pet.service;

import br.com.carv.pet.model.dto.request.EmployeePostRequest;
import br.com.carv.pet.model.dto.request.EmployeePutRequest;
import br.com.carv.pet.model.dto.response.EmployeeGetResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface EmployeeService {

    EmployeeGetResponse findById(UUID id);

    EmployeeGetResponse save(EmployeePostRequest employeePostRequest);

    EmployeeGetResponse update(EmployeePutRequest employeePutRequest);

    void delete(UUID id);

    Page<EmployeeGetResponse> findAllPaginated(Pageable pageable);

    List<EmployeeGetResponse> findAll();
}
