import java.util.Scanner;

/*Exercise CircleComputation (User Input): Write a program called CircleComputation,
 *  which prompts user for a radius (of double) and compute the area and perimeter 
 *  of a circle. 
Hints: π is kept in a constant called Math.PI.
*/

public class CircleComputation{
    public static void main(String [] args ) {
		System.out.println("Input radius:");
		Scanner in=new Scanner(System.in);
		double r=in.nextDouble();
		in.close();
		
		System.out.println("S="+ new CircleComputation().area(r));
		System.out.println("l="+ new CircleComputation().perimeter(r));
    		
    }	
	
	/**
	 * 计算圆面积
	 * @param radius
	 * @return 面积大小
	 */
	public double area(double radius){
			
		//write code here.
		return radius*radius*Math.PI;
	}
	
	/**
	 * 计算圆周长
	 * @param radius
	 * @return 圆周长
	 */
	public double perimeter(double radius){
			
		//write code here.
		return 2*radius*Math.PI;
	}
}