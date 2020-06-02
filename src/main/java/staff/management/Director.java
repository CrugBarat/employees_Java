package staff.management;

public class Director extends Manager {

    private Double budget;

    public Director(String name, String nationalInsuranceNumber, Double salary, String deptName, Double budget) {
        super(name, nationalInsuranceNumber, salary, deptName);
        this.budget = budget;
    }

    public Double getBudget() {
        return this.budget;
    }

    public Double payBonus() {
        return ( this.getSalary() /100 ) * 2;
    }
}

