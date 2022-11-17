package hw3;
import java.io.*;

public class p38 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("insert a string");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		System.out.println("insert a word you want to search ");
		
		String str2 = br.readLine();
		char ch = str2.charAt(0);
		
		int num = str.indexOf(ch);
		
		if(num != 1)
			System.out.println(str + "的第" + (num +1) + "個字就是[" + ch +"]");
		else
			System.out.println("沒有這個字");
	}

}
