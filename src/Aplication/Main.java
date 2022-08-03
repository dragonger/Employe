package Aplication;

import entities.Employee;
import entities.outsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("Enter the nunber of Employees");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee data #" + i + 1 + " data:");

            System.out.println("Outsource (y/n) ");
            char ch = sc.next().charAt(0);

            System.out.println("name");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("hours");
            int hours = sc.nextInt();

            System.out.println("Value per hour");
            double valuePerHour = sc.nextDouble();

            if (ch == 'y') {
                System.out.println("Additional Charge:");
                double additionalCharge = sc.nextDouble();
                list.add(new outsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                list.add(new Employee(name, hours, valuePerHour));
            }

        }
        System.out.println("Payment");
        for (Employee emp : list) {
            System.out.println(emp.getName() + "- $ " + String.format("%.2f", emp.payment()));
        }

    }
}