/**
 * Athlete class for an Athlete
 * @author Jean-Luc , Roman
 * 
 **/
public class Athlete {
	
    FinalResult athlete;
    String name;

    //Athlete holds a finalResult
    Athlete(FinalResult athlete, String name) {
        this.athlete = athlete;
        this.name = name;
    }
    /**
     * Compares an athlete to an input athlete and return true if that athlete has more points than the input
     * athlete
     * @param anAthlete
     * @return boolean
     */
    boolean betterSkiier(Athlete anAthlete){
        return this.athlete.skiingResult.pointsEarned() < anAthlete.athlete.skiingResult.pointsEarned();

    }
    /**
     * Compares an athlete to an input athlete and returns true if that athlete has more points earned than the input
     * athlete
     * @param anAthlete
     * @return boolean
     */
    boolean betterShooter(Athlete anAthlete){
        return this.athlete.shootingResult.pointsEarned() > anAthlete.athlete.shootingResult.pointsEarned();
    }

    /**
     * Compares an athlete to an input athlete and returns true if that athlete is a better skier and better shooter than the
     * input athlete
     * @param anAthlete
     * @return boolean
     */
    boolean hasBeaten(Athlete anAthlete){
        return (betterSkiier(anAthlete) || betterShooter(anAthlete));
    }
}