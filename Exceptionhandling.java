import java.util.Scanner;

class Employee {

    String name;
    int age;
    float salary;

    void setData(String name, int age, float salary) throws Exception {

        if (name.length() > 20)
            throw new Exception("Name must be within 20 characters");

        if (age <= 18)
            throw new Exception("Age must be greater than 18");

        if (salary < 50000)
            throw new Exception("Salary must be at least 50000");

        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

public class Exceptionhandling {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Employee e=new Employee();

        try {
            System.out.print("Enter Name: ");
            String name=sc.nextLine();

            System.out.print("Enter Age: ");
            int age=sc.nextInt();

            System.out.print("Enter Salary: ");
            float salary=sc.nextFloat();

            e.setData(name, age, salary);

            System.out.println("Data inserted successfully.");
        }
        catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        finally {
            sc.close();
        }
    }
}

