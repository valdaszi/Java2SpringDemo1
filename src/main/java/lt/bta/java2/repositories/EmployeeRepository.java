package lt.bta.java2.repositories;

//import org.springframework.data.repository.CrudRepository;
import lt.bta.java2.model.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {

    List<Employee> findByHireDate(LocalDate hireDate);

}
