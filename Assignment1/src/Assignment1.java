import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		//Declare five variables
				
		double v, a, d, h, size;
		
		//Get the values of the variables
		
		System.out.println("Please enter the velocity of the cannonball.");
		v = in.nextDouble();
		
		System.out.println("Please enter the angle the cannonball will be shot at.");
		a = in.nextDouble();
		
		System.out.println("Please enter the distance to the target.");
		d = in.nextDouble();
		
		System.out.println("Please enter the elevation of the bottom of the target.");
		h = in.nextDouble();
		
		System.out.println("Please enter the size of the target.");
		size = in.nextDouble();
		
		double vCos = v*Math.cos(Math.toRadians(a));
		
		//When the angle was 90 or 270, vCos was still calculated to be a very small distance
		//(on the order of 10^-16). Should be zero, and output the following message.
		
		if(v == 0 || a == 90 || a == 270) {
			System.out.println("The distance cannot be calculated with that input.");
		} 
		else 
		{
			if(vCos > 0) {
			
			//Define time and height of ball at target distance
				
				double t = d/vCos;			
				double hBall = v*t*Math.sin(Math.toRadians(a))-((32.17*(Math.pow(t, 2))/2));
				
				//Conditions with their respective outputs
			
				if(hBall > h && hBall < (h + size)) {
					System.out.println("The cannonball hit the target!");
				}
				else if (hBall > 0 && hBall < h) {
					System.out.println("The cannonball went under the target. Height at the target was " + hBall + ".");
				} 
				else if (hBall > (h + size)) {
					System.out.println("The cannonball went over the target. Height at the target was " + hBall + ".");
				} 
				else {
					System.out.println("The cannonball did not make it to the target.");		
				}
			}
		}
	}
}