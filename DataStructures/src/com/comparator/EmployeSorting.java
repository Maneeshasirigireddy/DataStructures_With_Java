package com.comparator;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeSorting {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.println("Enter the number of employees:");
        int size = s.nextInt();
        s.nextLine();

        Employee[] e = new Employee[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter name for employee " + (i + 1) + ":");
            String name = s.nextLine();

            System.out.println("Enter salary for employee " + (i + 1) + ":");
            double salary = s.nextDouble();
            s.nextLine(); 

            e[i] = new Employee(name, salary);
        }

        System.out.println("How would you like to sort the employees");
        System.out.println("1. Salary ascending");
        System.out.println("2. Salary descending");
        System.out.println("3. Name ascending");
        System.out.println("4. Name descending");
        System.out.println("5. ID ascending");
        System.out.println("6. ID descending");

        int choice = s.nextInt();

        switch (choice) {
            case 1:
                Arrays.sort(e, new SalAsc());
                break;
            case 2:
                Arrays.sort(e, new SalDesc());
                break;
            case 3:
                Arrays.sort(e, new NameAsc());
                break;
            case 4:
                Arrays.sort(e, new NameDesc());
                break;
            case 5:
                Arrays.sort(e, new IdAsc());
                break;
            case 6:
                Arrays.sort(e, new IdDesc());
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        for (Employee d : e) {
            System.out.println(d);
        }
    }
}