//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.InputStreamReader;
import java.io.*;


public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file=new File("./information/test.txt");
//		FileInputStream is=new FileInputStream(file);
//		InputStreamReader reader=new InputStreamReader(is, "UTF-8");
//		BufferedReader br=new BufferedReader(reader);
		
	
		BufferedReader br=new BufferedReader(new FileReader(file));//buffer读取
		String line;
		int salary=0;
		while(true)
		{
			line=br.readLine();
			if(line==null)
			{
				BufferedWriter bw=new BufferedWriter(new FileWriter(file,true));//true是append false是全抹
				bw.write("\n");
				bw.write("总工资:"+salary);
				bw.close();
				break;
			}
			else
			{
				salary+=Integer.parseInt(line);
			}	
		}
		
//		String line;
//		while(true)
//		{
//			line=br.readLine();
//			if(line==null)
//			{
//				break;
//			}
//			else
//			{
//				System.out.println(line);
//			}
//		}
		
//		String line=br.readLine();
//		while(line!=null)
//		{
//			System.out.println(line);
//			line=br.readLine();
//		}
	

	}

}
