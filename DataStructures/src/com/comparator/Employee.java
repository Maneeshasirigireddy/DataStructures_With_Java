package com.comparator;

class Employee {
    String name;
    int id;
    double salary;
    static int Counter = 1; 

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.id = Counter++;
    }

    @Override
    public String toString() {
        return "Employee[id=" + id + "\t name= " + name + "\t salary=" + salary + "]";
    }

	
}


