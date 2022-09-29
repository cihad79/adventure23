public class Player {

    private Room currentRoom;

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room room) {
        this.currentRoom = room;
    }

    public boolean goNorth() {
        Room requestedRoom = currentRoom.getNorth();
        if (requestedRoom != null) {
            currentRoom = requestedRoom;
            return true;
        }
        return false;
    }

    public boolean goSouth() {
        Room requestedRoom = currentRoom.getSouth();
        if (requestedRoom != null) {
            currentRoom = requestedRoom;
            return true;
        }
        return false;
    }

    public boolean goWest() {
        Room requestedRoom = currentRoom.getWest();
        if (requestedRoom != null) {
            currentRoom = requestedRoom;
            return true;
        }
        return false;
    }

    public boolean goEast() {
        Room requestedRoom = currentRoom.getEast();
        if (requestedRoom != null) {
            currentRoom = requestedRoom;
            return true;
        }
        return false;
    }

}


