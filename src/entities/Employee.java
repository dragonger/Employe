package entities;

public class Employee {
    private String name;
    private Integer hours;
    private double valueperhour;

    public Employee() {
    }

    public Employee(String name, Integer hours, double valueperhour) {
        this.name = name;
        this.hours = hours;
        this.valueperhour = valueperhour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double getValueperhour() {
        return valueperhour;
    }

    public void setValueperhour(double valueperhour) {
        this.valueperhour = valueperhour;
    }

    public double payment() {
        return this.hours * valueperhour;
    }


    }

