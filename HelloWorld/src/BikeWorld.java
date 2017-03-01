
public class BikeWorld {

	public static void main(String[] args) {
		// Declarations (kan overal, hoeft niet bovenin....
		BikeRace goldRace; 
		BikeRace vlaanderen;
		Team lotto;
		Team lottoBelgie;
		int lengteVlaanderen = 230;
		String nameLotto = "Lotto Nederland Wielerteam";
		String nameLottoBelgie = "Lotto Belgie Wielerteam";
		String teamLeaderLottoBelgie = "Willem Flupkens";
		int numberInTeam;
		
		// aanroep zonder parameter
		goldRace = new BikeRace();
		System.out.println("zonder parameter");	
		System.out.println(goldRace.kilometers);

		// aanroep met parameter
		System.out.println("met parameters");
		vlaanderen = new BikeRace(lengteVlaanderen);
		System.out.println(vlaanderen.kilometers);
		
		vlaanderen.add1Team();
		vlaanderen.add1Team();
		vlaanderen.add1Team();
		System.out.print("Teams Ronde van Vlaanderen: ");
		System.out.println(vlaanderen.teams);
		
		goldRace.add1Team();
		System.out.print("Teams Amstel Gold Race: ");
		System.out.println(goldRace.teams);
		
		lotto = new Team(nameLotto);
		System.out.println(lotto.getName());
		
		numberInTeam = 15;
		lottoBelgie = new Team(nameLottoBelgie, numberInTeam, teamLeaderLottoBelgie );
		System.out.println(lottoBelgie.getName());
		System.out.println(lottoBelgie.getNumberOfCyclists());
		System.out.println(lottoBelgie.getTeamLeader());
	}
}
