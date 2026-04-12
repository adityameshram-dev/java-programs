// Define a class employee having data members as emp_id, name 
// and salary. Accept and display the data for five employees.

import java.util.Scanner;
class employee {
    int emp_id;
    String name;
    double salary;
    public void accept(Scanner sc) {
        System.out.println("Enter id, name, salary");
        emp_id = sc.nextInt();
        name = sc.next();
        salary = sc.nextDouble();
    }
    public void display() {
        System.out.println("Id : " + emp_id);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }
}
public class Que11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employee e[] = new employee[5];
        for (int i = 0;i<5;i++) {
            e[i] = new employee();
            e[i].accept(sc);
        }
        for (int i = 0;i<5;i++) {
            e[i].display();
        }
        sc.close();
    }
}
