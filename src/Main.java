
public class Main {
	
	public static Logic logicOb;
	private static FlyNumber flyList;
	private static From fromList;
	private static To toList;
	public static void main(String[] args) {
		
		System.out.println("--------Welcome to XX AirLine--------");
		flyList = new FlyNumber();
		fromList = new From();
		toList = new To();
		System.out.printf("Fly: %s       From: %s      To: %s\n", flyList.getFly(), fromList.getFrom(), toList.getTo());
		System.out.println("-------------------------------------");
		
		logicOb= new Logic();
		logicOb.start();
		

	}

}
