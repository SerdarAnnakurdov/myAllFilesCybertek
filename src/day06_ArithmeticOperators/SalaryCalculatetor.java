package day06_ArithmeticOperators;

public class SalaryCalculatetor {
    public static void main(String[] args) {
        double salary = 150000;
        double stateTaxRate = 0.09;
        double federalTaxRate = 0.25;

        double stateTax = salary * stateTaxRate;
        double federalTax = salary * federalTaxRate;
        double totalTax = stateTax + federalTax;

        double salaryAfterTax = salary - totalTax;

        System.out.println("Your salary is : $ "+salary);
        System.out.println("State tax is $ "+stateTax);
        System.out.println("Your federal  tax is  : "+federalTax);
        System.out.println("Your total tax is : "+totalTax);
        System.out.println("Salary after tax :"+salaryAfterTax);


    }
}

/*
veriables : salary ; stateTaxRate ; stateTax , federalTax , totalTax , salaryAfterTax,
            100000       0.08           0.2
 */
