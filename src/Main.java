import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		while(true)
		{
			System.out.println("enter 1 record student; enter 2 show student's information; enter 9 finish");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String number=br.readLine();
			if(number.equals("1"))
			{
				Controller.record();
			}
			else if(number.equals("2"))
			{
				Controller.showstudentInfo();
				break;
			}
			else if(number.equals("9"))
			{
				break;
			}
		}
		
		System.out.println("\n" + Controller.findMaxEmailLength());
		
		System.out.println(Controller.searchStudent());
		
//		System.out.println(Arrays.toString(Controller.findMaxEmailLength()));
	}

}
