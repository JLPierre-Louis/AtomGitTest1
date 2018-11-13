/**
 * MassStartResult is a mass start event
 * @author Jean-Luc , Roman
 * 
 **/
public class MassStartResult extends AbsResult implements IEvent {
	
	int startPlace;
	
	public MassStartResult(int startPlace, int place, double lap1, double lap2, 
						   double lap3, double lap4, int penalties) {
		super(place, penalties, lap1, lap2, lap3, lap4);
		this.startPlace = startPlace;
	}

}
