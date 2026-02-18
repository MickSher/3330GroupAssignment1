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
		if (hour != 23) {
			return(hour + ":00-" + (hour+1) +":00");
		}
		return("23:00-0:00");
	}
	
}
