package CS3330.GA1;

public class ReservationBook {
	private Reservation[] reservations;
	private int count = 0;

	public ReservationBook() {
		this.reservations = new Reservation[48];
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
			if(r.Id == id){
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
			if (room.name.compareToIgnoreCase(reservations[i].room.name)==0) {
				System.out.println(reservations[i]);
			}
			
		}
	}

}
