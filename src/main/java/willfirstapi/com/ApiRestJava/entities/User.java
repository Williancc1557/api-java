package willfirstapi.com.ApiRestJava.entities;

public class User {
    public long id;
    public String name;
    public String lastname;
    public int age;
    public String occupation;

    public User(long id, String name, String lastname, int age, String occupation) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.occupation = occupation;
    }
}
