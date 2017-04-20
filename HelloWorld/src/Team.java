
public class Team {
	private String name;
	private int numberOfCyclists = 10;
	private String teamLeader;
	
	Team(){
	}

	Team(String name){
		this.name = name;
	}

 	Team(String name, int numberOfCyclists, String teamLeader){
		this.name = name;
		this.teamLeader = teamLeader;
	}
	
	public String getName() {
	       return name;
	}
	
	public String getTeamLeader() {
	       return teamLeader;
	}
	
	public int getNumberOfCyclists() {
	       return numberOfCyclists;
	}
}
