package OhPe2021;

public class ehtolauseita {

	public static void main(String[] args) {

		boolean tilillaOnRahaa = false;
		int a = 10;
		int b = 20;
		
		if ( a > b && a < 5) {
			System.out.println("Molemmat ehdot toteutuvat!");
		}
		if (a < b || a == 6) {
			System.out.println("Jompikumpi toteutui!");
		}
		
		
		if ( !tilillaOnRahaa) {
			System.out.println("Tilaa pitsa.");
		}
		else {
			System.out.println("Tehdään salaattia.");
		}


	}

}
