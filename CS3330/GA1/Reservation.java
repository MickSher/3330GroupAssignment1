package CS3330.GA1;

public class Reservation {

	// variables
	private final int ID;
	private final Room room;
	private final String studentName;
	private final TimeSlot timeSlot;
	private boolean canceled = false;
	private boolean checkedIn = false;

	// methods
	public Reservation(final int ID, final Room room, final String studentName, final TimeSlot timeSlot) {
		if (ID < 0 || room == null || timeSlot == null || studentName.isEmpty()) {
			throw new IllegalArgumentException();
		}

		this.ID = ID;
		this.room = room;
		this.studentName = studentName;
		this.timeSlot = timeSlot;
	}

	public boolean checkIn() {
		// do we want to throw an exception or just make canceled false?
		if (this.canceled || this.checkedIn) {
			return false;
		}
		this.checkedIn = true;
		return true;
	}

	public boolean cancel() {
		// do we want to throw an exception or just make checkedIn false?
		if (this.isActive() || this.canceled) {
			return false;
		}
		this.canceled = true;
		return true;
	}

	public boolean isActive() {
		if (this.checkedIn) {
			return true;
		}
		return false;
	}

	public boolean canCheckIn() {
		if (this.canceled || this.checkedIn) {
			return false;
		}
		return true;
	}

	public int getID() {
		return this.ID;
	}

	public Room getRoom() {
		return this.room;
	}

	@Override
	public String toString() {
		return "Reservation number " + this.ID + " made by " + this.studentName + " for room " + this.room.toString()
				+ " at " + this.timeSlot.toString() + (this.checkedIn ? " that has been checked in" : "")
				+ (this.canceled ? " that has been canceled" : "");
	}

}
