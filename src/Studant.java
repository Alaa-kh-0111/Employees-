public abstract class Studant  {
    private long id ;

    public Studant(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private String name;
    private boolean ismale;

    public boolean isIsmale() {
        return ismale;
    }

    public Studant() {
        this.id = id;
        this.name = name;
        this.ismale = ismale;
    }

    public void setIsmale(boolean ismale) {
        if (true){
            id=120000+1000_000_000;


        }
        else {
            id=20220000+1000_000_000;
        }
        this.ismale = ismale;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Studant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }



}
