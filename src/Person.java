import java.io.Serializable;

/**
 * Created by Yauheni_Sidarenka on 9/8/2014.
 */
public class Person extends Entity {
    private static final long serialVersionUID = 1L;
    private String name;
    private String surname;

    public Person(Long id, String name, String surname) {
        super(id);
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "[" + getId() + " " + name + " " + surname + "]";
    }
}
