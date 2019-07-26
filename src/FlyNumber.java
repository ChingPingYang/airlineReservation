import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class FlyNumber {
	
	public ArrayList<String> flyList = new ArrayList<String>();
	public File file = new File("FlyNumber.txt");
	public int num;
	public Random ran = new Random();
	
	
	public FlyNumber() {
		this.listMaker();
		this.randomFly();
	}
	
	public void listMaker() {
		try {
			Scanner input = new Scanner(file);
			String x = input.nextLine();
			while (x != null) {
				flyList.add(x);
				x = input.nextLine();
			}
			
		} catch (Exception ex) {
		}
	
	}
	
	public void randomFly() {
		num = ran.nextInt(flyList.size());
	}
	
	public String getFly() {
		return flyList.get(num);
	}
}
