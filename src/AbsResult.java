import java.util.LinkedList;

/**
 * Abstract class for SkiingResult and MassStartResult
 * @author Jean-Luc , Roman
 * 
 **/

public abstract class AbsResult implements IEvent{
	
	int place;
	int penalties;
	
	LinkedList<Double> laps = new LinkedList<Double>();
	
	public AbsResult (int place, int penalties, double lap1, double lap2, 
					  double lap3, double lap4) {
		this.place = place;
		this.penalties = penalties;
		this.laps.addFirst(lap1);
        this.laps.addFirst(lap2);
        this.laps.addFirst(lap3);
        this.laps.addFirst(lap4);
	}
	
	/**
     * Calculates the points earned
     * 
     * @param Null
     * @return a double value for total points earned
     * 
     */
	public double pointsEarned() {
		double points = 0; 
		if (laps.isEmpty()) {
			return 0;
		} else {
			for(Double aLap: this.laps) {
				points = aLap + points;
	    }
			return points; }
	    }
	
	/**
	 * Calculates the athletes penalties
	 * @param null
     * @return a double value for total penalties earned
     */
    public double getPenalties() {
        return penalties * 5;
    }

}
