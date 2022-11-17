package hw3;
import java.io.*;

public class p34 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("insert an integer");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int num = Integer.parseInt(str);
		
		System.out.println("NUMBER YOU INSERT IS " + num);
	}

}
