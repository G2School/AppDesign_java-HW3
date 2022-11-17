package hw3;
import java.io.*;

public class p37 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("insert an alphabat");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String stru = str.toUpperCase();
		String strl = str.toLowerCase();
		
		System.out.println("convert to Capital is  " + stru);
		System.out.println("convert to small letter is  " + strl);
	}

}
