package ch07;

public class Employee {
    /*private int timeSalary;

    public Employee(int timeSalary) {
        this.timeSalary = timeSalary;
    }
    public int getTimeSalary() {
        return timeSalary;
    }*/
    public void calculateSalary() {
        System.out.println("금월 급여정보를 알려드리겠습니다.");
    }

}

class FullTimeEmployee extends Employee {
    private double yearSalary;
    public FullTimeEmployee(double yearSalary) {
        this.yearSalary = yearSalary;
    }
    @Override
    public void calculateSalary() {
        super.calculateSalary();
        System.out.println((this.yearSalary/12.0)+"원 입니다.");

    }
}

class PartTimeEmployee extends Employee {
    private double timeSalary;
    private int workTime;

    public PartTimeEmployee(double timeSalary, int workTime) {
        this.timeSalary = timeSalary;
        this.workTime = workTime;
    }
    @Override
    public void calculateSalary() {
        super.calculateSalary();
        System.out.println((double)timeSalary*workTime + "원 입니다.");
    }
}
