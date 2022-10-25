package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        float newSalary;
        if (salary < 10000 && salary > 0) {
            newSalary = salary * 0.85f;
            System.out.println(newSalary);
        } else if (salary >= 10000 && salary < 20000) {
            newSalary = salary * 0.82f;
            System.out.println(newSalary);
        } else if (salary >= 20000) {
            newSalary = salary * 0.8f;
            System.out.println(newSalary);
        } else {
            System.out.println("wrong input!");
        }
    }
}
