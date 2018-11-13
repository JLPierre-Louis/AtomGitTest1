/**
 * ShootingRound holds shootingrounds
 * @author Jean-Luc , Roman
 * 
 **/
public class ShootingRound{
	
    int targetsHit;
    boolean standing;

    // Shooting round holds number of targets hit 0-5
    ShootingRound(int targetsHit, boolean standing){
        this.targetsHit = targetsHit;
        this.standing = standing;
    }
}