package javaPractice;

public class SalaryException extends RuntimeException {
public SalaryException() {
	System.out.println("Salary Can't be less than 0");
}
}
