package CS3330.GA1;

public class Reservation {
	
	//variables
	private final int ID;
	private final Room room;
	private final String studentName;
	private final TimeSlot timeSlot;
	private boolean canceled = false;
	private boolean checkedIn = false;
	
	//methods
	public Reservation(final int ID, final Room room, final String studentName, 
			final TimeSlot timeSlot) {
		if (ID < 0 || room == null || timeSlot == null || studentName.isEmpty()) {
			throw new IllegalArgumentException();
		}
		
		this.ID = ID;
		this.room = room;
		this.studentName = studentName;
		this.timeSlot = timeSlot;
	}
	
	public void markCheckedIn() {
		//do we want to throw an exception or just make canceled false?
		if (canceled) {
			throw new IllegalArgumentException();
		}
		checkedIn = true;
	}
	
	public void markCanceled() {
		//do we want to throw an exception or just make checkedIn false?
		if (this.isActive()) {
			throw new IllegalArgumentException();
		}
		canceled = true;
	}
	
	public boolean isActive() {
		if (this.checkedIn) {
			return true;
		}
		return false;
	}
	
	public boolean canCheckIn() {
		if (this.canceled) {
			return false;
		}
		return true;
	}

	public int getID() {
		return ID;
	}
	
	public Room getRoom() {
		return this.room;
	}
	
	
	
	
	
	
	
	
}
