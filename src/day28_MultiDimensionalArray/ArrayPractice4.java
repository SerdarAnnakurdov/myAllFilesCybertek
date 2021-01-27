package day28_MultiDimensionalArray;

public class ArrayPractice4 {
    public static void main(String[] args) {
        String[] employeeNames = {"serdar", "mekan", "arslan", "arsik", "guga", "vepa", "talyp", "bezik"};
        int[] employeeSalary = {    100000,  110000,  105000,  120000,  125000, 125000, 125000,  100000};
        
        
        int max = employeeSalary[0];//to find max salary
        for(int each : employeeSalary){
            if(each>max){
                max = each;
            }
        }

        System.out.println("max = " + max);

        for(int i = 0; i < employeeNames.length; i++){// to compare the employees salary with the maximum salary
            if(max == employeeSalary[i]){ // if the employee's salary  is equal to max salary
                System.out.println(employeeNames[i]);
            }
        }

    }

}
