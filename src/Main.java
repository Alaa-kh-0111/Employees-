import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Department> departments = new ArrayList<>();


        while (true) {

            System.out.println("1.Add department");
            System.out.println("2.Vewi department");
            System.out.println("3.delate department");
            System.out.println("4.edit department");
            System.out.println("5.Exat");
            System.out.print("Enter A choees:");
            int choees = s.nextInt();
            if (choees == 1) {
                System.out.println("Enter a number department add:");
                int numdep = s.nextInt();
                for (int i = 0; i < numdep; i++) {
                    System.out.println("Enter a name department:");
                    String name = s.next();
                    System.out.println("Enter A id");
                    int id = s.nextInt();
                    System.out.println("Enter a number syudant add:");
                    int numstu = s.nextInt();
                    ArrayList<Studant> studants = new ArrayList<>();

                    for (int g = 0; g < numstu; g++) {
                        System.out.println("Enter a name Studant:");
                        String namestu = s.next();
                        System.out.println("Enter A id");
                        int idstu = s.nextInt();
                        System.out.println("Enter A gpa");
                        double gpa = s.nextDouble();
                        Studant stu = new Studant(namestu, idstu, gpa);
                        studants.add(stu);
                        Department de = new Department(id, name, studants);
                        departments.add(de);

                    }
                }
            } else if (choees==2) {
                System.out.println(departments);

            } else if (choees==3) {
                System.out.println("Eneter num depa");
                int id=s.nextInt();
                for (int i = 0; i <departments.size() ; i++) {
                    if (id==departments.get(i).getId()){
                     Department v=   departments.remove(i);
                     System.out.println("remove!"+"/"+v.getName());
                    }
                }

            } else if (choees==4) {
               System.out.println("Enyer a id department");
               int id=s.nextInt();
                for (int i = 0; i <departments.size() ; i++) {
                    if (id==departments.get(i).getId());
                    System.out.println("welcom to"+departments.get(i).getName());
                    Department c=departments.get(i);
                    System.out.println("new id");
                    int idnew=s.nextInt();

                    c.setId(idnew);
                    System.out.println("new name department");
                    String newname=s.next();
                    c.setName(newname);

                    System.out.println("Enter num studant");
                    int nums=s.nextInt();
                    for (int j = 0; j < nums; j++) {
                        ArrayList<Studant>studants=new ArrayList<>();
                        System.out.println("Enter name studant");
                        String nmaes=s.next();
                        System.out.println("Enter id");
                        int d=s.nextInt();
                        System.out.println("Enter gpa");
                        double gpa=s.nextDouble();
                        Studant st=new Studant(nmaes,d,gpa);
                        studants.add(st);
                        System.out.println("Ok!scsessful");




                    }


                }
            } else if (choees==5) {
                System.exit(5);
            }

        }
    }
}

