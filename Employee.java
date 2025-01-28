package Day16;

import java.util.Scanner;

class Emp {
    private int id;
    private String name;
    private String dep;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getDep() {
        return dep;
    }
}

public class Employee {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Department: ");
        String depart = sc.nextLine();

        Emp e = new Emp();
        e.setId(id);
        e.setName(name);
        e.setDep(depart);

        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + e.getId());
        System.out.println("Name: " + e.getName());
        System.out.println("Department: " + e.getDep());

    }
}

