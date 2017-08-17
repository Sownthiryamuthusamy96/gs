import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class word {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String s[]=str.split(" ");
		char c[]=str.toCharArray();
		int i,count=0;
		for(i=0;i<s.length;i++)
		{
			count++;
		}
		System.out.println(count);
		
	}

}
