
class BikeRace {
	int kilometers = 150;
	int teams = 0;
    private int maxTeams = 2;
	
	// constructors
	BikeRace() {		
	}
	
	BikeRace(int kilometers) {
		this.kilometers = kilometers;
	}
	
	// Methods
	void add1Team() {
		if (teams < maxTeams)
			teams++;
		else
			handleTooMany();
	}

	private void handleTooMany() {
		System.out.println("Te veel Teams");
	}

}
