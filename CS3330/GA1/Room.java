package CS3330.GA1;

public class Room {
	
	private final String roomName;
	private final int capacity;
	
	public Room(final String roomName, final int capacity) {
		if (roomName.isEmpty() || capacity <= 0) {
			throw new IllegalArgumentException();
		}
		this.roomName = roomName;
		this.capacity = capacity;
	}
	
	public boolean canAccommodate(int userCount) {
		if (userCount < 0) {
			throw new IllegalArgumentException();
		}
		else if (this.capacity < userCount) {
			return false;
		}
		return true;
	}
	
	//getters
	public int getCapacity() {
		return this.capacity;
	}
	
	public String getName() {
		return this.roomName;
	}
	
	
	@Override
	public String toString() {
		return(roomName + " (cap " + capacity + ")");
	}
	
	public int compareNames(Room other) {
		return this.roomName.compareToIgnoreCase(other.roomName);
	}
}
