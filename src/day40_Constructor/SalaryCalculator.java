package day40_Constructor;

import java.text.DecimalFormat;

public class SalaryCalculator {
    public static int numberOfWorkingDays, numberOfWeeks;

    public double weeklyHours, hourlyRate, stateTaxRate, federalTaxRate, salary, salaryAfterTax, totalTax;

    static {
        numberOfWeeks = 5;
        numberOfWeeks = 52;
    }

    public SalaryCalculator(double hours, double hourlyRate, double stateTaxRate, double federalTaxRate) {
        if (stateTaxRate > 1) {
            stateTaxRate /= 100;
        }

        if (federalTaxRate > 1) {
            federalTaxRate /= 100;
        }


        this.weeklyHours = hours;
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        salary = weeklyHours * hourlyRate * numberOfWeeks;
        totalTax = (stateTaxRate + federalTaxRate) * salary;
        salaryAfterTax = salary - totalTax;
    }


    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "SalaryCalculator-->>>" +
                "weeklyHours = " + df.format(weeklyHours) +
                ", hourlyRate = $" + df.format(hourlyRate) +
                ", stateTaxRate = " + df.format(stateTaxRate) +
                ", federalTaxRate = " + federalTaxRate +
                ", salary = " + df.format(salary) +
                ", salaryAfterTax = " + df.format(salaryAfterTax) +
                ", totalTax = $" + df.format(totalTax);
    }

}



