			Emp.java
package employee;

public class Emp {
    private String name;
    private int empID;
    private String category;
    private double basicPay;
    private double hra;
    private double da;
    private double netPay;
    private double pf;
    private double grossPay;
    private double incomeTax;
    private double allowance;

    public Emp(String name, int empID, String category, double basicPay) {
        this.name = name;
        this.empID = empID;
        this.category = category;
        this.basicPay = basicPay;
    }

    public void calculateHRA() {
        if (category.equals("A")) {
            hra = 0.5 * basicPay;
        } else if (category.equals("B")) {
            hra = 0.4 * basicPay;
        } else {
            hra = 0.3 * basicPay;
        }
    }

    public void calculateDA() {
        da = 0.1 * basicPay;
    }

    public void calculateNetPay() {
        grossPay = basicPay + hra + da;
        pf = 0.12 * basicPay;
        incomeTax = 0.2 * grossPay;
        netPay = grossPay - pf - incomeTax;
    }

    public void printPayroll() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empID);
        System.out.println("Category: " + category);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("PF: " + pf);
        System.out.println("Income Tax: " + incomeTax);
        System.out.println("Net Pay: " + netPay);
    }
}
		EmpPay.java

			package employee;

public class EmpPay {
    public static void main(String[] args) {
        Emp e = new Emp("John Doe", 123, "A", 20000.00);
        e.calculateHRA();
        e.calculateDA();
        e.calculateNetPay();
        e.printPayroll();
    }
}