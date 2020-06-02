package staff.management;

public class Director extends Manager {

    private double budget;

    public Director(String name, String nationalInsuranceNumber, Double salary, String deptName, Double budget) {
        super(name, nationalInsuranceNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }

    public double payBonus() {
        return ( this.getSalary() /100 ) * 2;
    }
}

