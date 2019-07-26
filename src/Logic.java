import java.util.Scanner;
import java.util.Random;
public class Logic implements Runnable{

	private Thread thread;
	private boolean running = false;
	private int user;
	private FirstClass fC = new FirstClass();
	private Economy eN = new Economy();
	private boolean full = false;
	private int seatFir = 5;
	private int seatEn = 5;
	
	public void update() throws InterruptedException {
		
		while (full != true) {
			System.out.println("Choose a seat: 1.FirstClass 2.Economy");
			Scanner input = new Scanner(System.in);
			int x = input.nextInt();
			if (x == 1) {
				if (fC.firstClass.size() < seatFir) {
					System.out.println("You got the seat.");
					fC.addCustomer();
				} else {
					System.out.println("FirstClass is full. Choose economy please.");
				}
			} else if (x == 2) {
				if (eN.economyList.size() < seatEn) {
					System.out.println("You got the seat.");
					eN.addCustomer();
				} else {
					System.out.println("Ecnomy is full. Choose first class please.");
				}
			}
			if (fC.firstClass.size() == seatFir  && eN.economyList.size() == seatEn) {
				full = true;
			}
		}
		System.out.printf("\n\nNow, all seats are taken.\n");
		System.out.println("Please take next flight.");	
		stop();
	}
	
	public synchronized void start() {
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop() throws InterruptedException {
		running = false;
		thread.join();
	}
	
	@Override
	public void run() {
		while (running) {
			try {
				update();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
