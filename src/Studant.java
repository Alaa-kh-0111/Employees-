import java.util.ArrayList;

public class Studant {
    private String name;
    private int id;
    private double gba;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Studant{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gba=" + gba +
                '}';
    }

    public int getId() {
        return id;
    }

    public double getGba() {
        return gba;
    }

    public void setGba(double gba) {
        this.gba = gba;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public void getAvg(double g,double g1) {
//        double sum=0;
////        int num= grades.size();
//        System.out.println(sum);
////        sum=g+g1;
////       double ave=sum/num;
////       System.out.println(ave);




//    public void addGrade(double grade){
//        grades.add(grade);
//    }

//    public ArrayList<Double> getGrad() {
//        return grades;
//    }

//    public void setGrad(ArrayList<Double> grad) {
//
//        this.grades = grad;
//    }

    public Studant(String name, int id,double gba) {
        this.name = name;
        this.id = id;
        this.gba=gba;

    }

//    private ArrayList<Double>grades;


}
