package modelo;

public class User {
    private int iduser;
    private String username;
    private String password;
    private int iduser_create;
    private Person person;

    public User() {
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIduser_create() {
        return iduser_create;
    }

    public void setIduser_create(int iduser_create) {
        this.iduser_create = iduser_create;
    }

    public Person getPerson() {
        return person;
    }

    public void setIdperson(Person person) {
        this.person = person;
    }
}
