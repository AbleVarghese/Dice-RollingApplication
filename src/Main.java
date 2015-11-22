import java.util.Random;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		int ran1; int ran2;
		
		Random Dice1 = new Random();
		Random Dice2 = new Random();
		
		
		ran1 =1+Dice1.nextInt(6);
		ran2 =1+Dice1.nextInt(6);
		
		System.out.println(ran1+ran2);
	}
	

}
