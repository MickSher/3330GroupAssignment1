package CS3330.GA1;

public class TimeSlot {
	
	private final int hour;
	
	public TimeSlot(final int hour) {
		if ((hour < 0) || (hour > 23)) {
			throw new IllegalArgumentException();
		}
		this.hour = hour;
	}
	
	@Override
	public String toString() {
		
			return(hour + ":00-" + ((hour+1)%24) +":00");
		
		
	}
	
}
