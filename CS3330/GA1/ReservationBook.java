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

	//adds a reservation to the book
	public boolean add(Reservation r) {
		//check to see if we hit max reservations
		if (count == reservations.length) {
			throw new IllegalAccessError();
		}
		// add reservation in the next open space
		//index of the last reservation is at count-1
		reservations[count] = r;
		//increase count
		count++;

		return true;
	}

	//finds a reservation with the given ID
	public Reservation findById(int id) {
		Reservation r;
		//check for invalid ID
		if (id < 0) {
			return null;
		}
		
		for (int i = 0; i < count; i++) {
			r = reservations[i];
			//reservation with ID found return that reservation
			if (r.getID() == id) {
				return r;
			}
		}
		// no reservation with that ID
		return null;
	}

	//print all the reservations
	public void printAll() {
		for (int i = 0; i < count; i++) {
			System.out.println(reservations[i]);
		}
	}

	//Prints all reservations for a given room
	public void printForRoom(Room room) {
		for (int i = 0; i < count; i++) {
			// Compares room names using the String class .compareTo()
			// reduces unnecessary access by giving the reservation the room to compare to it's room
			if (reservations[i].compareRooms(room) == 0) {
				System.out.println(reservations[i]);
			}

		}
	}

	//cancels a reservation with given ID
	public boolean cancelReservation(int id) {
		//finds the right reservation
		Reservation r = findById(id);
		//returns if the reservation was successfully canceled
		return r.cancel();
		
	}
	
	//checks in a reservation with given ID
	public boolean checkInReservation(int id) {
		//finds the right reservation
		Reservation r = findById(id);
		//returns if the reservation was successfully checked in
		return r.checkIn();
		
	}

}
