import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class To {
	
	public File file = new File("To.txt");
	
	public static ArrayList<String> ToList = new ArrayList<String>();
	public Random ran = new Random();
	public int num;
	
	public To() {
		this.makeList();
		this.randomNum();
	}
	
	
	public void makeList() {
		try {
			Scanner input = new Scanner(file);
			String x = input.nextLine();
			while (x != null) {
				ToList.add(x);
				x = input.nextLine();
			}
		} catch (Exception ex) {
		}
	}
	
	public void randomNum() {
		num = ran.nextInt(ToList.size());
	}
	
	public String getTo() {
		return ToList.get(num);
	}
}
