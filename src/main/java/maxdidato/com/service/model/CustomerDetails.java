package maxdidato.com.service.model;

public class CustomerDetails {
    private String name;
    private String surname;
    private String nin;

    public CustomerDetails(String name,String surname,String nin){
        this.name = name;
        this.surname = surname;
        this.nin = nin;
    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNin() {
        return nin;
    }

    public void setNin(String nin) {
        this.nin = nin;
    }
}
