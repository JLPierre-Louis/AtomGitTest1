import java.util.LinkedList;
/**
 * ShootingResult holds shooting results
 * @author Jean-Luc , Roman
 * 
 **/

public class ShootingResult implements IEvent {
	
	LinkedList<ShootingRound> rounds;

    // ShootingResult holds 4 shooting rounds
    ShootingResult(LinkedList<ShootingRound> rounds) {
    	this.rounds = rounds;
    }
    /**
     * @return double 
     */
    public double pointsEarned() {
    	double points = 0; 
    	if (rounds.isEmpty()) {
    		return 0;
    	} else {
    		for(ShootingRound aRound : rounds) {
    			points = aRound.targetsHit + points;
    		}
    	return points; }
    }

    //getPenalties gets the total penalties by multiplying the number of targets missed total by 60
    public double getPenalties() {
        return (20 - this.pointsEarned()) * 60;
    }
    
    public ShootingRound bestRoundByType(boolean isStanding) {
    	ShootingRound base = new ShootingRound(0, isStanding);
    	LinkedList<ShootingRound> tempRounds = new LinkedList<ShootingRound>();
    	for(ShootingRound aRound : rounds) {
    		if(aRound.standing == isStanding) {
    			tempRounds.addFirst(aRound);
    		}
    	}
    	if (tempRounds.isEmpty()) {
    		return null;
    	} else {
    	for(ShootingRound anotherRound : tempRounds) {
    		if(anotherRound.targetsHit >= base.targetsHit) {
    			base = anotherRound;
    		} 
    	} }
    	return base;
    }
}