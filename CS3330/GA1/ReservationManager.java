package CS3330.GA1;

public class ReservationManager {
	private ReservationBook reservationBook;
	private static int idGenerator = 0;

	public ReservationManager(int numReservations) {
		if (numReservations<0) {
			throw new IllegalArgumentException("Can't hold negative reservations");
		}
		reservationBook = new ReservationBook(numReservations);
	}
	
	//creates a reservation and adds it to the reservation book
	public boolean createReservation(Room room, String studentName, TimeSlot slot) {
		Reservation reservation = new Reservation(idGenerator++, room, studentName, slot);
		
		//returns if the reservation was successfully added
		return reservationBook.add(reservation);
	}
	
	//cancels a reservation with given ID
	public boolean cancelReservation(int id) {
		//returns if the reservation was successfully canceled
		return reservationBook.cancelReservation(id);
	}
	
	//checks in a reservation with given ID
	public boolean checkInReservation(int id) {
		return reservationBook.checkInReservation(id);
	}
	
	//prints all the reservations in the reservation book
	public void printAllReservations() {
		reservationBook.printAll();
	}
	
	//prints all reservations for a specific room
	public void printRoomReservations(Room room) {
		reservationBook.printForRoom(room);
	}
}
