import java.util.Scanner;

public class ClimbStairs {
	public static void main(String[] args) {
		System.out.println("Input n:");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		System.out.println("f"+"("+n+")="+climbStairs(n));
	}

	public static int climbStairs(int n) {
			
		int i;
		int former1=1;
		int former2=1;
		int next=0;
//		int r;
		
		if(n==0||n==1)
//			System.out.println("f"+"("+n+")=1");
			return 1; 
		else {
			for(i=2;i<=n;i++) {
				next=former1+former2;
				former1=former2;
				former2=next;
			}
			return next;
//			System.out.println("f"+"("+n+")="+next);
		}		
//		return 0;
	}
}
