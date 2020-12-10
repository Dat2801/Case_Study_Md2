package program;

import object.Room;

import java.util.Scanner;

public class Delete {
    public static void deleteInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên khách cần xóa: ");
        String name = scanner.nextLine();
        int n = 0;
        for (int i = 0; i < RoomProgram.rooms.size(); i++) {
            if (name.equals(RoomProgram.rooms.get(i).getPerson().getName())) {
                System.out.println(RoomProgram.rooms.remove(n));
                n++;
            }
        }
        if (n == 0) {
            System.out.println("Không tìm thấy tên để xóa");
        }
    }
}
