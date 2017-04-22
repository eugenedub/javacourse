
public class Bikeworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BikeRace goldRace; 
		BikeRace vlaanderen;
		int lengteVlaanderen = 230;
		ProTeam lottoNl = new ProTeam();
        lottoNl.setName("Lotto Jumbo Cycling team");
        lottoNl.setSponsorAmount(10000.0D);

        ProTeam lottoBe = new ProTeam();
        lottoBe.setName("Lotto Soudal Cycling team");
        lottoBe.setSponsorAmount(11000.0D);

        System.out.println(lottoBe.getName());
        System.out.println(lottoBe.getSponsorAmount());
        System.out.println(lottoBe.getClass());
		// aanroep zonder parameter
		goldRace = new BikeRace();
		System.out.println("zonder parameter");	
		System.out.println(goldRace.kilometers);

		// aanroep met parameter
		System.out.println("met parameters");
		vlaanderen = new BikeRace(lengteVlaanderen);
		System.out.println(vlaanderen.kilometers);
		
		vlaanderen.add1Team();
		System.out.print("Teams Ronde van Vlaanderen: ");
		System.out.println(vlaanderen.teams);
		
		System.out.print("Teams Amstel Gold Race: ");
		System.out.println(goldRace.teams);
	}

}
