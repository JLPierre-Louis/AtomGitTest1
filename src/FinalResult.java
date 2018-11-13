/**
 * FinalResult holds final results
 * @author Jean-Luc , Roman
 * 
 **/
public class FinalResult {
    ShootingResult shootingResult;
    SkiingResult skiingResult;

    // FinalResult holds a shootingResult and a SkiingResult
    FinalResult(ShootingResult shootingResult, SkiingResult skiingResult){
        this.shootingResult = shootingResult;
        this.skiingResult = skiingResult;
    }

    /**
     * finalScore returns the finalscore of the skier including the discounted
     * penalties depending on their placement.
     * @return double
     */
    double finalScore(){
        double skiScore = skiingResult.pointsEarned() + skiingResult.getPenalties();
        double shootingScore = shootingResult.getPenalties();

        if (skiingResult.place == 1){
            return (skiScore + shootingScore - 10);
        }
        if (skiingResult.place == 2){
            return (skiScore + shootingScore - 7);
        }
        if (skiingResult.place == 3){
            return (skiScore + shootingScore - 3);
        }
        if (skiingResult.place == 4){
            return (skiScore + shootingScore - 1);
        }
        return skiScore + shootingScore;
    }
}