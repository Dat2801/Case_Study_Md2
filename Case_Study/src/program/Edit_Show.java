package program;

import object.Room;
import java.util.Scanner;
public class Edit_Show {
    public static void editInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên khách thuê cần chỉnh sửa: ");
        String name = scanner.nextLine();
        int a = 0;
        for (int i = 0; i < RoomProgram.rooms.size(); i++) {
            if (name.equals(RoomProgram.rooms.get(i).getPerson().getName())) {
                System.out.println("Nhập tên cần sửa");
                String input = scanner.nextLine();
                RoomProgram.rooms.get(i).getPerson().setName(input);
                System.out.println("Tên khách thuê đã sửa: " + RoomProgram.rooms.get(i).getPerson().getName());
                a++;
            }
        }
        if (a == 0) {
            System.out.println("Không tìm thấy tên khách thuê");
        }

    }

    public static void showInformation() {
        for (Room room : RoomProgram.rooms) {
            System.out.println(room.toString());
        }
    }

}
