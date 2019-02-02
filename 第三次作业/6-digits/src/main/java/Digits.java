import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		System.out.println("Input your number:");
		Scanner in=new Scanner(System.in);
		int input=in.nextInt();
		in.close();
		System.out.printf(new Digits().reverseInt(input));
	}
	
	public String reverseInt(int input){
			
		String str = String.valueOf(input);
		char[] chars = new char[1000];
		int num;
		int i;
		
		num=str.length();
		
		for(i=0;i<num;i++) {
			chars[i]=str.charAt(i);
		}
		
		char[] r = new char[num];
		for(i=num-1;i>=0;i--) {
//			System.out.print(chars[i]);
			r[num-1-i] = chars[i];
		}		
		return String.valueOf(r);
	}
}
