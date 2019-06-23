package ch10pc02;
import java.time.LocalDate;

/**
 *
 * @author Frank
 */
public class ShiftSupervisor extends Employee {
    //fields
    public double salary;
    public double bonus;
    
    //constructors
    public ShiftSupervisor(){
        name = "";
        employeeID = "";
        hireDate = LocalDate.now();
        salary = 0.0;
        bonus = 0.0;
    }
    public ShiftSupervisor(String name, String employeeID, LocalDate hireDate, double salary, double bonus) {
        this.name = name;
        this.employeeID = employeeID;
        this.hireDate = hireDate;
        this.salary = salary;
        this.bonus = bonus;
    }
    
    //methods
    //accessors
    public double getSalary() {
        return salary;
    }
    public double getBonus() {
        return bonus;
    }
    
    //mutators
    public void setSalary (double salary) {
        this.salary = salary;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
