package CS3330.GA1;

public class ReservationBook {
	private Reservation[] reservations;
	private int count = 0;

	public ReservationBook(int numReservations) {
		this.reservations = new Reservation[numReservations];
	}

	public boolean add(Reservation r) {
		if (this.count == this.reservations.length) {
			throw new IllegalAccessError();
		}
		this.reservations[count] = r;
		this.count++;

		return true;
	}

	public Reservation findById(int id) {
		Reservation r;
		if (id < 0) {
			return null;
		}
		for (int i = 0; i < count; i++) {
			r = this.reservations[i];
			if (r.getID() == id) {
				return r;
			}
		}

		return null;
	}

	public void printAll() {
		for (int i = 0; i < count; i++) {
			System.out.println(this.reservations[i]);
		}
	}

	public void printForRoom(Room room) {
		for (int i = 0; i < count; i++) {
			if (room.compareNames(this.reservations[i].getRoom()) == 0) {
				System.out.println(this.reservations[i]);
			}

		}
	}

	public boolean cancelReservation(int id) {
		Reservation r = this.findById(id);
		return r.cancel();
		
	}
	public boolean checkInReservation(int id) {
		Reservation r = this.findById(id);
		return r.checkIn();
		
	}

}
