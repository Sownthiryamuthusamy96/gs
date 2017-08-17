import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class para {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		int count=0;
		do
		{
		 str=br.readLine();
		 count++;
		}while(!str.endsWith("."));
		
		 String s[]=str.split("\\n");
		//System.out.println(s.length);
		System.out.println(count);
		
	}

}
