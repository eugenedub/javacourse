
class BikeRace {
	int kilometers = 150;
	int teams;
    private int maxTeams = 20;
	
	// constructors
	BikeRace() {		
	}
	
	BikeRace(int kilometers) {
		this.kilometers = kilometers;
	}
	
	// Methods
	
	void ad1team() {
		if (teams <= maxTeams) {
			++teams;
		}
		
	}

}
