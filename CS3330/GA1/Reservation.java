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
		if (canceled || checkedIn) {
			return false;
		}
		checkedIn = true;
		return true;
	}

	public boolean cancel() {
		// do we want to throw an exception or just make checkedIn false?
		if (isActive() || canceled) {
			return false;
		}
		canceled = true;
		return true;
	}

	public boolean isActive() {
		if (checkedIn) {
			return true;
		}
		return false;
	}

	public boolean canCheckIn() {
		if (canceled || checkedIn) {
			return false;
		}
		return true;
	}

	public int getID() {
		return ID;
	}

	public Room getRoom() {
		return room;
	}

	@Override
	public String toString() {
		return "Reservation number " + ID + " made by " + studentName + " for " + room.toString()
				+ " at " + timeSlot.toString() + (checkedIn ? " that has been checked in" : "")
				+ (canceled ? " that has been canceled" : "");
	}

}
