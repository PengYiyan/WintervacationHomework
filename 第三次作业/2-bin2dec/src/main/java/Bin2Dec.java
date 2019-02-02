import java.util.Scanner;


public class Bin2Dec {
    public static void main(String [] args ) {
		System.out.println("Input your numbers:");
		Scanner in=new Scanner(System.in);
		String str = in.next();
		in.close();
		
		System.out.printf(new Bin2Dec().bin2dec(str));
    }	
	
	public String bin2dec(String input){
		char[] nums = new char[100];
		int num;
		int total=0;
		int i;
		int j=1;//用作计算的
		
//		input=in.next();
		num=input.length();
		//初始化j
		for(i=0;i<num-1;i++)
			j=j*2;
		
		for(i=0;i<num;i++) {
			nums[i]=input.charAt(i);
		}
		
		for(i=0;i<num;i++) {
			if(nums[i]!='0') {
				total=total+j;
			}
			j=j/2;
				
		}
		return String.valueOf(total);
	}
	
}
