package CS3330.GA1;

public class Room {
	
	//fields
	private final String roomName;
	private final int capacity;
	
	//constructor for Room
	public Room(final String roomName, final int capacity) {
		if (roomName.isEmpty() || capacity <= 0) {
			throw new IllegalArgumentException();
		}
		this.roomName = roomName;
		this.capacity = capacity;
	}
	
	//alternative method to getCapacity that adds more encapsulation
	public boolean canAccommodate(int userCount) {
		if (userCount < 0) { //if userCount is below 0
			throw new IllegalArgumentException(); //throw an error
		}
		else if (capacity < userCount) { //else if capacity is less than userCount, return false
			return false;
		}
		return true;
	}
	
	//getters
	public int getCapacity() {
		return capacity;
	}
	
	public String getName() {
		return roomName;
	}
	
	
	@Override
	public String toString() {
		return(roomName + " (cap " + capacity + ")"); //Example: Room 101 (cap 4)
	}
	
	public int compareNames(Room other) { //compares one room name to another using .compareTo. Returns difference between letters.
		return roomName.compareTo(other.roomName);
	}
}
