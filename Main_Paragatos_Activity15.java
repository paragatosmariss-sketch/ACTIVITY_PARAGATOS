abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double computeSalary();
    public abstract String getEmployeeType();
    public abstract double computeDeductions();

    public double computeNetSalary() {
        return computeSalary() - computeDeductions();
    }

    public void printPayslip() {
        System.out.println(name + "'s gross salary: " + computeSalary()
                + " (" + getEmployeeType() + ")");
        System.out.println("Deductions: " + computeDeductions());
        System.out.println("Net salary: " + computeNetSalary());
    }
}

interface Bonusable {
    double computeBonus();
    boolean isEligibleForBonus();
}

interface Auditable {
    String generateEmployeeId();
    void logSalaryComputation(String employeeId);
}

class RegularEmployee extends Employee implements Bonusable, Auditable {
    private static final double ATTENDANCE_BONUS = 1000;
    private static final double TAX_RATE = 0.10;

    public RegularEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double computeSalary() {
        return baseSalary + ATTENDANCE_BONUS;
    }

    @Override
    public String getEmployeeType() {
        return "Regular Employee";
    }

    @Override
    public double computeDeductions() {
        return computeSalary() * TAX_RATE;
    }

    @Override
    public double computeBonus() {
        return baseSalary * 0.05;
    }

    @Override
    public boolean isEligibleForBonus() {
        return true;
    }

    @Override
    public String generateEmployeeId() {
        return "REG-" + name.toUpperCase();
    }

    @Override
    public void logSalaryComputation(String employeeId) {
        System.out.println("Audit log: " + employeeId + " salary computed.");
    }
}

class SalesEmployee extends Employee implements Bonusable {
    private double commission;
    private static final double TAX_RATE = 0.12;

    public SalesEmployee(String name, double baseSalary, double commission) {
        super(name, baseSalary);
        this.commission = commission;
    }

    @Override
    public double computeSalary() {
        return baseSalary + commission;
    }

    @Override
    public String getEmployeeType() {
        return "Sales Employee";
    }

    @Override
    public double computeDeductions() {
        return computeSalary() * TAX_RATE;
    }

    @Override
    public double computeBonus() {
        return commission * 0.10;
    }

    @Override
    public boolean isEligibleForBonus() {
        return commission > 0;
    }
}

class ContractualEmployee extends Employee implements Auditable {
    private double hoursWorked;
    private double hourlyRate;
    private static final double TAX_RATE = 0.05;

    public ContractualEmployee(String name, double hoursWorked, double hourlyRate) {
        super(name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double computeSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String getEmployeeType() {
        return "Contractual Employee";
    }

    @Override
    public double computeDeductions() {
        return computeSalary() * TAX_RATE;
    }

    @Override
    public String generateEmployeeId() {
        return "CON-" + name.toUpperCase();
    }

    @Override
    public void logSalaryComputation(String employeeId) {
        System.out.println("Audit log: " + employeeId + " salary computed.");
    }
}

public class Main_Paragatos_Activity15 {
    public static void main(String[] args) {

        Employee[] employees = {
            new RegularEmployee("Ana", 15000),
            new SalesEmployee("Ben", 12000, 5000),
            new ContractualEmployee("Cruz", 160, 75)
        };

        for (Employee e : employees) {
            e.printPayslip();

            if (e instanceof Bonusable) {
                Bonusable b = (Bonusable) e;

                if (b.isEligibleForBonus()) {
                    System.out.println("Bonus: " + b.computeBonus());
                }
            }

            if (e instanceof Auditable) {
                Auditable a = (Auditable) e;
                a.logSalaryComputation(a.generateEmployeeId());
            }

            System.out.println("--------------------------------");
        }
    }
}