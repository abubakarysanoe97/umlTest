package umlTest;

public abstract class Employee extends Customer{


    public Employee(String name) {
        super(name);
    }
    private double discount;
    public abstract void printEmployeePriceAfterDiscount(String clothing);

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
