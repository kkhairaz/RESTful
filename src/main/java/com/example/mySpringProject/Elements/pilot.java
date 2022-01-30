
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "PILOTS")
public class pilot {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "BASE")
    private Integer base;

    @Column(name = "WORK_DAYS")
    private Integer workDays;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBase() {
        return this.base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getWorkDays() {
        return this.workDays;
    }

    public void setWorkDays(String workDays) {
        this.workDays = workDays;
    }

}