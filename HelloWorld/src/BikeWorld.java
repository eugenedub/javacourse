
public class BikeWorld {

	private static int hashGoldRace;

	public static void main(String[] args) {
		// Declarations (kan overal, hoeft niet bovenin....
		BikeRace goldRace; 
		BikeRace vlaanderen;
		Team lotto;
		Team lottoBelgie;
		int lengteVlaanderen = 230;
		StringBuilder sb = new StringBuilder(50);
		
		String nameLotto = "Lotto Nederland Wielerteam";
		String nameLottoBelgie = "Lotto Belgie Wielerteam";
		String teamLeaderLottoBelgie = "Willem Flupkens";
		
		int numberInTeam;
		
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
		System.out.print("Teams Ronde van Vlaanderen dit jaar: ");
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
		
		sb = sb.append("Teams: ");
		sb = sb.append(nameLotto + " " + nameLottoBelgie);
		System.out.println(sb);
		hashGoldRace = goldRace.hashCode();
		System.out.println("hashGoldRace: " + hashGoldRace);
	}
}
