import java.io.Serializable;

/**
 * Created by Yauheni_Sidarenka on 9/8/2014.
 */
public abstract class Entity implements Serializable {

    private Long id;

    public Entity(final Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }
}
