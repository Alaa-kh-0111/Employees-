import java.util.ArrayList;

public class Department implements Ali {
    private int id;
    private String name;
    private ArrayList<Studant>studants;

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", studants=" + studants +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Studant> getStudants() {
        return studants;
    }

    public void setStudants(ArrayList<Studant> studants) {
        this.studants = studants;
    }

    public Department(int id, String name, ArrayList<Studant> studants) {
        this.id = id;
        this.name = name;
        this.studants = studants;
    }

    @Override
    public void nn() {

    }
}
