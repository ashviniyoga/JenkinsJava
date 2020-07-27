package com.lesson1;

public class FrogJump {

	static int frogJump(int x, int y, int d) {
		int jump=x, count=0;
 		System.out.println("Inside frog jump "+ x + " " + y+ " " +d );
//		if(x>=y) {
//		System.out.println("Its not jumping");
//			return 0;
//		}
//		else {
//			
//			while(jump<=y) {
//				System.out.println("Inside while else " + jump + " " + count);
//				
//				jump+= d; //System.out.println(jump);
//				count++;
//			}
//			System.out.println(jump);
//			
//		}
	if((y-x)%d==0) {
				return (y-x)/d;
			}
			else {
				return(y-x)/d+1;
		}
		
	

		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("jump frog");
		int res = frogJump(5,85,10);
		System.out.println(res);

	}

}
