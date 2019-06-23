package ch10pc02;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Frank
 * date 11/26/2017
 * purpose: to demonstrate the Employee and ShiftSupervisor classes
 */
public class Ch10pc02 {

    public static void main(String[] args) {
        //variables
        String name;
        String employeeID;
        String date;
        LocalDate hireDate;
        double salary;
        double bonus;
        boolean validID , validDate;
        
        //create Scanner object keyboard
        Scanner keyboard = new Scanner(System.in);
                
        //Request input from user
        System.out.print("Please enter the name of the employee hired: ");
        name = keyboard.nextLine();
        do {
            System.out.print("Please enter the employee's ID: ");
            employeeID = keyboard.nextLine();
            if (Employee.validID(employeeID))
                validID = true;
            else {
                System.out.println("Invalid employee ID.  Please use the appropriate format (NNN-L).");
                validID = false;
            }
        } while (!validID);
        
        do{
            System.out.print("Please enter the employee's hire date: ");
            date = keyboard.nextLine();
            if (Employee.validDate(date))
                    validDate = true;
            else {
                System.out.println("Invalid date.  Please use the appropriate format (MM/DD/YYYY).");
                validDate = false;
            }
        }while (!validDate);
        //convert date from String into LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        hireDate = LocalDate.parse(date, formatter);
        
        System.out.print("Please enter the employee's salary: ");
        salary = keyboard.nextDouble();
        
        System.out.print("Please enter the employee's bonus: ");
        bonus = keyboard.nextDouble();
        
        //Instantiate the ShiftSupervisor class
        ShiftSupervisor supervisor = new ShiftSupervisor(name, employeeID, hireDate, salary, bonus);
        
        //Display output to user:
        System.out.print("Congratulations on hiring " + supervisor.getName() + " on " + supervisor.getDate().toString() + ".  The employee will receive a wage of $" + supervisor.getSalary() + ".");
    }
    
}
