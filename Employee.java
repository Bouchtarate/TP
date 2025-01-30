import java.time.*;
import java.time.temporal.ChronoUnit;
public class Employee {
    public String name;
    public String hireDate;
    public double salary;

    public Employee(String name,String hireDate,double salary){
        this.name=name;
        this.hireDate=hireDate;
        this.salary=salary;
    }
    public void calcYearsOfService(){
        LocalDate givenDate = LocalDate.parse(hireDate);
        LocalDate today = LocalDate.now();
        long yearsPassed = ChronoUnit.YEARS.between(givenDate, today);
        System.out.println("The employee:"+this.name+" work "+yearsPassed+" years in this startup");
    }
}
