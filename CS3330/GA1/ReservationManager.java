package CS3330.GA1;

public class ReservationManager {
	private ReservationBook reservationBook;
	private static int idGenerator = 0;

	public ReservationManager(int numReservations) {
		reservationBook = new ReservationBook(numReservations);
	}
	
	public boolean createReservation(Room room, String studentName, TimeSlot slot) {
		Reservation reservation = new Reservation(idGenerator++, room, studentName, slot);
		
		return reservationBook.add(reservation);
	}
	
	public boolean cancelReservation(int id) {
		return reservationBook.cancelReservation(id);
	}
	
	public boolean checkInReservation(int id) {
		return reservationBook.checkInReservation(id);
	}
	
	public void printAllReservations() {
		reservationBook.printAll();
	}
	
	public void printRoomReservations(Room room) {
		reservationBook.printForRoom(room);
	}
}
