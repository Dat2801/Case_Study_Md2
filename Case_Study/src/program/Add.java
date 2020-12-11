package program;

import object.Room;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Add implements Serializable {
    public static void addInformation() {
        Scanner scanner = new Scanner(System.in);
        Room room = new Room();
        PersonProgram personProgram = new PersonProgram();
        room.setPerson(personProgram.roomer());

        System.out.println("Số phòng cho khách thuê: ");
        int roomNumber = Integer.parseInt(scanner.nextLine());
        room.setRoomNumber(roomNumber);

        System.out.println("Loại phòng: ");
        try {
            String size = scanner.nextLine();
            room.setSizeRoom(size);
        } catch (Exception e) {
            System.out.println("Mời bạn nhập lại");
        }

        System.out.println("Giá phòng: ");
        double rate = Double.parseDouble(scanner.nextLine());
        room.setRateRoom(rate);

        System.out.println("Ngày bắt đầu thuê: ");
        Date date = null;
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
        } catch (ParseException e) {
        }
        room.setStartDay(date);

        System.out.println("Ngày kết thúc thuê: ");
        Date date1 = null;
        try {
            date1 = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
        } catch (ParseException e) {
        }
        room.setEndDay(date1);

        RoomProgram.rooms.add(room);
    }
}
