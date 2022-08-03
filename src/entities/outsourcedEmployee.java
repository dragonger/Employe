package entities;

public class outsourcedEmployee extends Employee {

    private double additionalCharge;

    public outsourcedEmployee() {
        super();
    }

    public outsourcedEmployee(String name, Integer hours, double valueperhour, double additionalCharge) {
        super(name, hours, valueperhour);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment()+additionalCharge*1.1;

    }

    @Override
    public String toString() {
        return "outsourcedEmployee{" +
                "additionalCharge=" + additionalCharge +
                '}';
    }
}
