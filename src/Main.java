import java.util.Random;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		int ran1, ran2, ranSum;
		int [] sumArray = new int[12]; 
		int [] sumRepeat = new int[12]; 
		
		Random Dice1 = new Random();
		Random Dice2= new Random();
		
		
		//Initialize sumArray	
		for(int i=0;i<11;i++){
			
			sumArray[i]=i+2;
			
			
		}
		
		for(int j=0;j<11;j++){
			
			sumRepeat[j]=0;
			
			
		}
		

		
		for(int n=0;n<36000;n++){
			
			ran1 =1+Dice1.nextInt(6);
			ran2 =1+Dice2.nextInt(6);
			 ranSum = ran1+ran2;
			 
			 for(int m=0;m<35;m++){
			 if(sumArray[m]==ranSum)
			 {sumRepeat[m]++;
			 break;			 }
			 
			 }
		}
			 
		
		
		//Print array
		 
			for(int k=0;k<11;k++)
			{
				System.out.println(sumArray[k]+"="+sumRepeat[k]);
			}
			
	
	}
}
