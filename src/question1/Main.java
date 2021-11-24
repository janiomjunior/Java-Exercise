package question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread thread = new Thread(new Main());
		thread.start();
			
	}

	@Override
	public void run() {
		
		String[] ticker = {"VALE3", "ABEV3","PETR3", "WEGE3", "SANB11", "ITUB4", "RDOR3", "JBSS3","BBDC3",
				"BBAS3", "BVMF3", "SUZB3", "MGLU3", "ITSA4", "HAPV3", "GNDI3", "BBSE3", "ELET3", "RENT3",
				"CSNA3", "RADL3", "NTCO3", "RUMO3", "EGIE3", "CRFB3", "CSNA3", "CPFE3", "GGBR4", "BTOW3",
				"LREN3", "BRDT3", "SBSP3", "CCRO3", "ETQL3", "KLBN11", "TOTS3", "HYPE3", "MFRG3","BRFS3",
				"BRKM5"};
			
		int quantity; // int number = random.nextInt(max - min) + min; - > min inclusive, max exclusive
		
		double price; 
		
		List<Transaction> list = new ArrayList<>();
		
		int  pos = new Random().nextInt(39);
		
		for( int i = 1 ; i <= 1000000; i++) {
			
			quantity = new Random().nextInt(21 + 10) - 10;
			
			price = new Random().nextInt(3 - 1) + 1;
			
			pos = new Random().nextInt(40); //value between 0 inclusive, 40 exclusive
			
			list.add(Transaction.transaction(ticker[pos], quantity, price));
			
		}

		System.out.print(TransactionStatistics.mostPopularTicker(list));
		
	}

}
