/*
*	Project Euler
*	Even Fibonacci Numbers - Problem 2
*	@author Melissa Beltran
*/
package euler;

import java.util.Scanner;

public class evenFibonacci{
	//Class variables
	private int sum, max;
	private boolean first;
	//Methods
	public evenFibonacci(){
		this.sum = 0;
		this.first = true;
		this.max = 0;
	}
	public evenFibonacci(int n){
		this.sum = 0;
		this.first = true;
		this.max = n;
	}
	/*
	*	Runs through fibonacci sequence below 'max' value
	*	then adds even fibonacci values together
	*/
	public void calculate(){
                int one_fib = 0; int two_fib = 0; int current_fib = 0;
		while (current_fib < max){
                    if(current_fib % 2 == 0){
                        this.sum += current_fib;
                    }
                    if(first){
                        one_fib = 1;
                        two_fib = one_fib + one_fib;
                        current_fib = two_fib;
                        first = false;
                    }
                    else{
                        current_fib = one_fib + two_fib;
                        one_fib = two_fib;
                        two_fib = current_fib;
                    }
		}
	}
	public void showResults(){
                System.out.print("The total sum for even Fibonacci values below "+max+" is ");
		System.out.print(String.format("%s\n",sum));
	}
        
    public static void main(String[] args){
        int n = 0;
        evenFibonacci obj;
        if(args.length == 0)
            System.out.println("No input arguments, try again");
        else{
		n = Integer.parseInt(args[0]);
		while(n <0 && n >4000000){
                    System.out.print("INVALID value! Please enter"
                            + " a positive number less than 4 million: ");
                    Scanner sc = new Scanner(System.in);
                    n = sc.nextInt();
		}
			
		obj = new evenFibonacci(n);
		obj.calculate();
		obj.showResults();
        }
    }
}
