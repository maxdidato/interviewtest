package maxdidato.com.service;

import maxdidato.com.service.model.CustomerDetails;

import java.util.HashMap;
import java.util.Random;

public class SalaryRetriever {
    private static HashMap<String,Long> repository = new HashMap<>();
    static {
        repository.put("ABCDE1",13000L);
        repository.put("ABCDE2",15000L);
        repository.put("ABCDE3",16000L);
        repository.put("ABCDE4",17000L);
        repository.put("ABCDE5",19000L);
        repository.put("ABCDE6",20000L);
    }

    public Long retrieveSalary(String nin){
        try {
            Thread.sleep(100 + new Random().nextInt(500));
        } catch (InterruptedException e) {
        }
        return repository.get(nin);
    }
}
