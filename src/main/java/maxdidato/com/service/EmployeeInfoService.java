package maxdidato.com.service;

import maxdidato.com.service.model.CustomerDetails;

import java.util.HashMap;
import java.util.Random;

public class EmployeeInfoService {
    private static HashMap<String,CustomerDetails> repository = new HashMap<>();
    static {
        repository.put("0001",new CustomerDetails("John","Smith","ABCDE1"));
        repository.put("0002",new CustomerDetails("Mike","Tyson","ABCDE2"));
        repository.put("0003",new CustomerDetails("Brad","Pitt","ABCDE3"));
        repository.put("0004",new CustomerDetails("Tom","Cruise","ABCDE4"));
        repository.put("0005",new CustomerDetails("Sharon","Stone","ABCDE5"));
        repository.put("0006",new CustomerDetails("Cameron","Diaz","ABCDE6"));
    }

    public CustomerDetails retrieveCustomerDetails(String id){
        try {
            Thread.sleep(100 + new Random().nextInt(500));
        } catch (InterruptedException e) {
        }
        return repository.get(id);
    }
}
