package CS3330.GA1;

public class Main {

	public static void main(String[] args) {
		ReservationManager reservationManager = new ReservationManager(10);
		Room engineringStudyRoomE = new Room("Enginering Study Room E", 10);
		Room engineringStudyRoomF = new Room("Enginering Study Room F", 5);
		Room engineringStudyRoomG = new Room("Enginering Study Room G", 15);
		Room engineringStudyRoomH = new Room("Enginering Study Room H", 12);

		reservationManager.createReservation(engineringStudyRoomE, "Johnny", new TimeSlot(8));
		reservationManager.createReservation(engineringStudyRoomF, "Billy", new TimeSlot(10));
		reservationManager.createReservation(engineringStudyRoomF, "Tammy", new TimeSlot(12));
		reservationManager.createReservation(engineringStudyRoomE, "Calc Tutoring", new TimeSlot(9));
		reservationManager.createReservation(engineringStudyRoomE, "Calc Tutoring", new TimeSlot(10));
		reservationManager.createReservation(engineringStudyRoomG, "Tommy", new TimeSlot(15));
		reservationManager.createReservation(engineringStudyRoomG, "Jenny", new TimeSlot(6));
		
		
		reservationManager.checkInReservation(3);
		reservationManager.checkInReservation(6);
		reservationManager.printAllReservations();
		reservationManager.cancelReservation(0);
		System.out.println();
		reservationManager.printRoomReservations(engineringStudyRoomE);

	}

}
