package CS3330.GA1;

import java.lang.foreign.AddressLayout;
import java.util.Iterator;

public class ReservationBook {
	private Reservation[] reservations;
	private int count = 0;

	public ReservationBook(int numRooms) {
		if (numRooms > 0) {
			reservations = new Reservation[numRooms];
		}
	}

	public boolean add(Reservation r) {
		if (count == reservations.length) {
			return false;
		}
		reservations[count] = r;
		count++;

		return true;
	}
	
	public Reservation findById(int id) {
		Reservation r;
		if(id < 0) {
			return null;
		}
		for (int i = 0; i < count; i++) {
			r = reservations[i];
			if(r.id == id){
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
			if (Integer. room.name.compareToIgnoreCase(reservations[i].room.name)) {
				System.out.println(reservations[i]);
			}
			
		}
	}

}
