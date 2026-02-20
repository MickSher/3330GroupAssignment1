package CS3330.GA1;

public class ReservationBook {
	private Reservation[] reservations;
	private int count = 0;

	public ReservationBook(int numReservations) {
		if (numReservations<=0) {
			throw new IllegalArgumentException("Can't have less than one reservations");
		}
		reservations = new Reservation[numReservations];
	}

	public boolean add(Reservation r) {
		if (count == reservations.length) {
			throw new IllegalAccessError();
		}
		reservations[count] = r;
		count++;

		return true;
	}

	public Reservation findById(int id) {
		Reservation r;
		if (id < 0) {
			return null;
		}
		for (int i = 0; i < count; i++) {
			r = reservations[i];
			if (r.getID() == id) {
				return r;
			}
		}

		return null;
	}

	public void printAll() {
		for (int i = 0; i < count; i++) {
			System.out.println(reservations[i]);
		}
	}

	public void printForRoom(Room room) {
		for (int i = 0; i < count; i++) {
			// Compares room names using the String class .compareTo()
			// reduces unnecessary access by giving the reservation the room to compare to it's room
			if (reservations[i].compareRooms(room) == 0) {
				System.out.println(reservations[i]);
			}

		}
	}

	public boolean cancelReservation(int id) {
		Reservation r = findById(id);
		return r.cancel();
		
	}
	public boolean checkInReservation(int id) {
		Reservation r = findById(id);
		return r.checkIn();
		
	}

}
