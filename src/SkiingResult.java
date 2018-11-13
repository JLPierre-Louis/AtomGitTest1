
/**
 * SkiingResult holds skiing results
 * @author Jean-Luc Pierre-Louis, Roman Wicky van Doyer
 *
 */
public class SkiingResult extends AbsResult{

    //SkiingResult holds place, time for each lap, and number of penalties
    public SkiingResult(int place, double lap1, double lap2, double lap3, double lap4, int penalties) {
        super(place, penalties, lap1, lap2, lap3, lap4);
    }
    
}