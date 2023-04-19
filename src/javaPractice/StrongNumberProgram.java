package javaPractice;

	import java.util.Scanner;
	 
	public class StrongNumberProgram {
	    //Write a program to check the given number is Strong number or not.
	    public static void main(String args[])
	    {
	        int num,originalNum,rem,fact,i,sum=0;
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter a number : ");
	        num=in.nextInt();
	        originalNum=num;
	        while (num>0)//145>0  14>0 1>0
	        {
	            rem=num%10;
	            System.out.println("Reminder : "+rem);
	            fact=1;
	            for(i=1;i<=rem;i++){
	                fact*=i;//fact=fact*i
	            }
	            System.out.println("fact : "+fact);
	            sum+=fact;
	            num=num/10;
	        }
	        if (sum == originalNum) {
	            System.out.println(originalNum + " is STRONG NUMBER");
	        } else {
	            System.out.println(originalNum + " is not a STRONG NUMBER");
	        }
	    }
	}
