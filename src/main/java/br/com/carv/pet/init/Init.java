package br.com.carv.pet.init;

import br.com.carv.pet.model.entity.Employee;
import br.com.carv.pet.model.utils.Address;
import br.com.carv.pet.model.utils.Contact;
import br.com.carv.pet.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class Init implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;
    private final Logger logger = Logger.getLogger(Init.class.getCanonicalName());

    public Init(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee("João Gabriel", "Carvalho",
                "27.joaogabriel@gmail.com",
                new Address("Eduardo Martins Romeira", "302", "House",
                        "Jardim Planalto", "SP", "Ribeirão do Sul", "19930000"),
                new Contact("14998045007", "1433791173"),
                "11122233344", "unemployed", null);

        this.employeeRepository.save(employee);
        logger.info("Employee saved into database");

    }
}
