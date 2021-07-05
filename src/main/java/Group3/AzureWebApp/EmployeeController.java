package Group3.AzureWebApp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/employee")
    List<Employee> employees() {
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee(1, "Nicole", "Robertson", "SSN", "Partner Connectivity", 55000, true, "2017"));
    employees.add(new Employee(2, "Annica", "Landbü", "SSN", "Tech enablement", 55000, true, "2013"));
    employees.add(new Employee(3, "Håkan", "Danielsson", "SSN", "Reach", 55000, true, "2010"));
    return employees;
    }

    /*@GetMapping ("/employee/{id}")
    Employee employee(@PathVariable int id){
        for (Employee i:employees()){
            if (i.getId()==id){
                return i;
            }
        }
    }*/

    /*@GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getProductByID(@PathVariable("id") int id) {
        List<Employee> employees = new ArrayList<>();
        if (id == 1) {
            return new ResponseEntity<Employee> (new Employee(1, "Nicole", "Robertson", "SSN", "Partner Connectivity", 55000, true, "2017"), HttpStatus.OK);
        } else if (id == 2) {
            return new ResponseEntity<Employee>(new Employee(2, "Annica", "Landbü", "SSN", "Tech enablement", 55000, true, "2013"), HttpStatus.OK);
        } else if (id == 3) {
            return new ResponseEntity<Employee>(new Employee(3, "Håkan", "Danielsson", "SSN", "Reach", 55000, true, "2010"), HttpStatus.OK);
        }

        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }*/
}
