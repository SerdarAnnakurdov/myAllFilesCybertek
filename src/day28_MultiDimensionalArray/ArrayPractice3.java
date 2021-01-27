package day28_MultiDimensionalArray;

public class ArrayPractice3 {
    public static void main(String[] args) {

        double[] salary = {100000.5, 110000.5, 120000.5, 95000.5, 90000.5};
        double sum = 0;

        double max = salary[0];
        double min = salary[0];




        for(double eachSalary : salary ){
            sum += eachSalary;
            if(eachSalary>max){
                max = eachSalary;
            }
            if(eachSalary<min){
                min = eachSalary;
            }

        }

        System.out.println("Total: "+sum);
        System.out.println("Average Salary of employees: "+(sum/salary.length));
        System.out.println("max = " + max);
        System.out.println("min = " + min);








    }
}
