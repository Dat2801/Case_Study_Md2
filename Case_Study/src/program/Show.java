package program;

import object.Room;

public class Show {
    public static void showInformation() {
        for (Room room : RoomProgram.rooms) {
            System.out.println(room.toString());
        }
    }
}
