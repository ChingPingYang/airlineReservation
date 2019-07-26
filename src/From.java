import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class From {
	public File file = new File("From.txt");
	
	public static ArrayList<String> fromList = new ArrayList<String>();
	public Random ran = new Random();
	public int num;
	
	public From() {
		this.makeList();
		this.randomNum();
	}
	
	
	public void makeList() {
		try {
			Scanner input = new Scanner(file);
			String x = input.nextLine();
			while (x != null) {
				fromList.add(x);
				x = input.nextLine();
			}
		} catch (Exception ex) {
		}
	}
	
	public void randomNum() {
		num = ran.nextInt(fromList.size());
	}
	
	public String getFrom() {
		return fromList.get(num);
	}
	
}
