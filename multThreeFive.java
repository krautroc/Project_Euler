package euler;

import java.math.*;

public class multThreeFive{
	//Class variables
	private int max;
	private int sum;
	//Methods
	public multThreeFive(){
		this.max = 1000;
		this.sum = 0;
	}
	public multThreeFive(int max){
		if (max <0 || max > 10000){
                    System.out.print("INVALID input: please enter a number > 0 or < 10,000"); 
                    exit();
		}
		//otherwise
		this.max = max;
	}
	/** calculateSum()
	*	adds all multiples of 3 AND 5 together. If a number is both
	*	a multiple of 3 and 5, then it is only added once
	*/
	public int calculateSum(){
		for(int i = 1; i< max; i++){
			if(i % 3 == 0)
                            sum += i;
			else if(i % 5 == 0)
                            sum += i;
		}
		return sum;
	}
	public void showResults(){
                System.out.print("The total sum for multipliers of 3 and 5 below "+max+" is ");
		System.out.print(String.format("%s\n",sum));
	}
        
        public static void main(String[] args){
            int sum, n = 0;
            multThreeFive obj;
            if(args.length == 0)
                System.out.println("No input arguments, try again");
            else{
		n = Integer.parseInt(args[0]);
		obj = new multThreeFive(n);
		sum = obj.calculateSum();
		obj.showResults();
            }
        }
}
