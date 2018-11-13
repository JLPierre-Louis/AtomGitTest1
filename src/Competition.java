import java.util.LinkedList;
/**
 * Competition class holds competitions
 * @author Jean-Luc , Roman
 * 
 **/

public class Competition {
	
	int ShootingRounds;
	
	LinkedList<Athlete> athletes = new LinkedList<Athlete>();
	
	Competition(int ShootingRounds, LinkedList<Athlete> athletes){
		this.ShootingRounds = ShootingRounds;
		this.athletes = athletes;
	}
	/**
	 * Makes a LinkedList of strings of the shooter's names who did not finish all the rounds
	 * @return LinkedList
	 */
	
	public LinkedList<String> shootingDNF() {
		LinkedList<String> tempList = new LinkedList<String>();
		for(Athlete anAthlete: this.athletes) {
			if (anAthlete.athlete.shootingResult.rounds.size() < this.ShootingRounds) {
				tempList.addLast(anAthlete.name);
			}
		}
		return tempList;
	}
	/**
	 * Return the final score for an athlete
	 * @param athName
	 * @return double
	 */
	
	public double finalScoreForAthlete(String athName) {
		double score = 0;
		for(Athlete anAthlete : this.athletes) {
			if(anAthlete.name.equals(athName)) {
				score = anAthlete.athlete.finalScore();
			}
		} return score;
	}
	
	/**
	 * Returns true if any athlete in "this" competition has done better than in different competitions
	 * @param aComp
	 * @return boolean
	 */
	public boolean anyImprovement(Competition aComp) {
		boolean anyoneBetter = false;
		for(Athlete anAthlete : this.athletes) {
			if(this.finalScoreForAthlete(anAthlete.name) < aComp.finalScoreForAthlete(anAthlete.name)) {
				anyoneBetter = true;
			}
		} return anyoneBetter;
	}

}
