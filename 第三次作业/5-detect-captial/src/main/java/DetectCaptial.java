import java.util.Scanner;

public class DetectCaptial {
	public static void main(String[] args) {
		System.out.println("Input your word:");
		Scanner in=new Scanner(System.in);
		String word;
		word=in.next();
		in.close();
		System.out.printf(String.valueOf(detectCapitalUse(word)));
	}

	public static boolean detectCapitalUse(String word) {
			
		char[] letter = new char[100];
		int num;
		int i;
		int output1=0;
		int output2=0;
		int output3=0;
		
		num=word.length();
		
		for(i=0;i<num;i++)
			letter[i]=word.charAt(i);
		
		if(letter[0]<='Z'&&letter[0]>='A') {
			for(i=1;i<num;i++) {
				if(letter[i]<='Z'&&letter[i]>='A')
					output1=1;
				else {
					output1=0;
					break;//是否为全大写
				}
			}
			for(i=1;i<num;i++) {
				if(letter[i]<='z'&&letter[i]>='a')
					output2=1;
				else {
					output2=0;
					break;
				}
			}
			
		}else {
			for(i=1;i<num;i++) {
				if(letter[i]<='z'&&letter[i]>='a')
					output3=1;
				else {
					output3=0;
					break;
				}
			}
		}
		if(output1==1||output2==1||output3==1)
			return true;
		else
			return false;
	}
		
//		return true;
//    }
	   
}