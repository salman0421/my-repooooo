package Introduction;

import java.util.Scanner;

public class pyramidpattern {
	int i,j,k,number;
	Scanner user_input;
	//to create one constructer
	public pyramidpattern(){
		user_input=new Scanner(System.in);
		//System.out.print("enter the layer of pyramid :" );
		
		number=user_input.nextInt();
		for(i=0;i<=number;i++){
			
			for(j=i;j<number;j++)
				System.out.print("  ");
			     
			for(k=1;k<(i*2);k++)
					System.out.print("*");
				System.out.print("\n");
		                      }
		
		
		                      
		
		
		
	}
public static void main(String[] args) {
	
	pyramidpattern obj=new pyramidpattern();
}
}
