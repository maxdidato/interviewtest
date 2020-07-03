import maxdidato.com.service.EmployeeInfoService;
import maxdidato.com.service.SalaryRetriever;
import maxdidato.com.service.model.CustomerDetails;

import java.util.Arrays;

public class EmployeePayslipGenerator {


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String[] ids = {"0001","0002","0003","0004","0005","0006"};
        Arrays.stream(ids).forEach( id -> {
            EmployeeInfoService employeeInfoService = new EmployeeInfoService();
            SalaryRetriever salaryRetriever = new SalaryRetriever();

            CustomerDetails customerDetails = employeeInfoService.retrieveCustomerDetails(id);
            Long salary = salaryRetriever.retrieveSalary(customerDetails.getNin());
            System.out.println(String.format("The salary of %s %s is : %s",customerDetails.getName(),customerDetails.getSurname(),salary));
        });
        long stopTime = System.currentTimeMillis();
        System.out.println(stopTime - startTime);
    }
}
    