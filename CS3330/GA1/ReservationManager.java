package CS3330.GA1;

public class ReservationManager {
	private ReservationBook reservationBook;
	private static int idGenerator = 0;

	public ReservationManager() {
		this.reservationBook = new ReservationBook();
	}
	
	public boolean createReservation(Room room, String studentName, TimeSlot slot) {
/*		Reservation reservation = new Reservation(room, studentName, slot, idGenerator++);
		if () {
			
		}*/
		return false;
	}
}
