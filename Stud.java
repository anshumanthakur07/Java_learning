import java.util.Scanner;

class Student {
    private String name;
    private int registrationNo;

    public Student(String name, int registrationNo) {
        this.name = name;
        this.registrationNo = registrationNo;
    }

    public void show() {
        System.out.println(name+","+registrationNo);
        
    }
}

public class Stud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String name;
        int registrationNo;
        Student student;

        
        choice = sc.nextInt();

        if (choice == 1) {
            
            name = sc.next();
            
            registrationNo = sc.nextInt();

            while (registrationNo < 0 || registrationNo==0) {
                
                registrationNo = sc.nextInt();
            }

            student = new Student(name, registrationNo);
            student.show();
        } else if (choice == 2) {
            student = new Student("null", 0);
            student.show();
        } else {
            System.out.println("Wrong Choice");
        }

        sc.close();
    }
}