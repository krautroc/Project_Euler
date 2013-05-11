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
		while(n < 0 && n >=10000){
				System.out.print("INVALID value! Please enter a positive number less than 4 million: ");
				Scanner sc = new Scanner(System.in);
				n = sc.nextInt();
		}
		obj = new multThreeFive(n);
		sum = obj.calculateSum();
		obj.showResults();
            }
        }
}
