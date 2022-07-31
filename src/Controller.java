import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Controller 
{
	public static String file="./studentsInfo.txt";
	public static void record() throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("id:");
		String id=br.readLine();
		System.out.println("email:");
		String email=br.readLine();
		System.out.println("home address:");
		String home=br.readLine();
		System.out.println("tutor:");
		String tutor=br.readLine();
		
		BufferedWriter bw=new BufferedWriter(new FileWriter(file,true));
		bw.write(id);
		bw.write("\n");
		bw.write(email);
		bw.write("\n");
		bw.write(home);
		bw.write("\n");
		bw.write(tutor);
		bw.write("\n");
		bw.close();
	}
	
	public static Map<String, Integer> findMaxEmailLength() throws Exception
	{
		int eMaxLength=0;
		int hMaxLength=0;
		int tMaxLength=0;
//		int[] maxLength={eLength, hLength, tLength};
		
		Map<String, Integer> dict=new HashMap<String, Integer>();
		dict.put("Max_Email_Length", eMaxLength);
		dict.put("Max_Home_Address_Length", hMaxLength);
		dict.put("Max_Tutor_Length", tMaxLength);
		
		BufferedReader br=new BufferedReader(new FileReader(file));
		
		String id=br.readLine();
		String email=br.readLine();
		String home=br.readLine();
		String tutor=br.readLine();
		
		eMaxLength=email.length();
		hMaxLength=home.length();
		tMaxLength=tutor.length();
		
		while(id!=null)
		{
			id=br.readLine();
			email=br.readLine();
			home=br.readLine();
			tutor=br.readLine();
			if(id==null)
			{
				break;
			}
			
			if(email.length() > dict.get("Max_Email_Length"))
			{
				dict.put("Max_Email_Length", email.length());
			}
			if(home.length() > dict.get("Max_Home_Address_Length"))
			{
				dict.put("Max_Home_Address_Length", home.length());
			}

			if(tutor.length() > dict.get("Max_Tutor_Length"))
			{
				dict.put("Max_Tutor_Length", tutor.length());
			}


		}
		
		return dict;
		
	}
	
	public static void showstudentInfo() throws Exception
	{
		BufferedReader br=new BufferedReader(new FileReader(file));
	
		while(true)
		{
			String id=br.readLine();
			String email=br.readLine();
			String home=br.readLine();
			String tutor=br.readLine();
			
			if(id==null)
			{
				break;
			}
			
			int emailLen=Controller.findMaxEmailLength().get("Max_Email_Length");
			int homeLen=Controller.findMaxEmailLength().get("Max_Home_Address_Length");
			int tutorLen=Controller.findMaxEmailLength().get("Max_Tutor_Length");
			
			System.out.print("+" + "------" + "+");

			for(int i=0; i<emailLen; i++)
			{
				System.out.print("-");
			}
			System.out.print("+");
			
			
			for(int j=0; j<homeLen; j++)
			{
				System.out.print("-");
			}
			
			System.out.print("+");
			
			for(int k=0; k<tutorLen; k++)
			{
				System.out.print("-");
			}
			
			System.out.println();
			
			System.out.print(" "+ id + " " + email );
			int space=emailLen-email.length();
			for(int x=0; x<=space; x++)
			{
				System.out.print(" ");
			}
			System.out.print(home);
			space=homeLen-home.length();
			for(int x=0; x<=space; x++)
			{
				System.out.print(" ");
			}
			System.out.print(tutor);
			
			
			System.out.println();
			
		}	
		
	}
	
	public static Map<String, String> searchStudent() throws Exception
	{
		Map<String, String> info=new HashMap<String, String>();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter student's ID:");
		String target=br.readLine();
		
		BufferedReader bf=new BufferedReader(new FileReader(file));
		
		while(true)
		{
			String id=bf.readLine();
			String email=bf.readLine();
			String home=bf.readLine();
			String tutor=bf.readLine();
			
			if(id==null)
			{
				break;
			}
			
			if(id.equals(target))
			{
				info.put("ID", id);
				info.put("Email", email);
				info.put("Home", home);
				info.put("Tutor", tutor);
			}
		}
		
		
		return info;
		
	}
	
	
}
