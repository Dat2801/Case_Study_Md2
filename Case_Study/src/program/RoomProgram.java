package program;

import object.Room;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class RoomProgram {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Room> rooms = new ArrayList<>();

    public void addInformation() {
        Room room = new Room();
        PersonProgram personProgram = new PersonProgram();
        room.setPerson(personProgram.roomer());

        System.out.println("Số phòng cho khách thuê: ");
        int roomNumber = Integer.parseInt(scanner.nextLine());
        room.setRoomNumber(roomNumber);

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

        rooms.add(room);
    }

    public void editInformation() {
        System.out.println("Nhập tên khách thuê cần chỉnh sửa: ");
        String name = scanner.nextLine();
        int a = 0;
        for (int i = 0; i < rooms.size(); i++) {
            if (name.equals(rooms.get(i).getPerson().getName())) {
                System.out.println("Nhập tên cần sửa");
                String input = scanner.nextLine();
                rooms.get(i).getPerson().setName(input);
                System.out.println("Tên khách thuê đã sửa: " + rooms.get(i).getPerson().getName());
                a++;
            }
        }
        if (a == 0) {
            System.out.println("Không tìm thấy tên khách thuê");
        }

    }

    public void showInformation() {
        for (Room room : rooms) {
            System.out.println(room.toString());
        }
    }

    public Room searchInformation() {
        System.out.println("Nhập số chứng minh thư khách thuê: ");
        try {
            int idCard = Integer.parseInt(scanner.nextLine());
            for (Room room : rooms) {
                if (idCard == room.getPerson().getIdCard()) {
                    System.out.println(room.toString());
                    return room;
                }
            }
            return null;
        } catch (Exception e) {
            System.out.println("Mời bạn nhập lại");
        }
        return null;
    }

    public void sortInformation() {

    }

    public void billRoom() {
        int idCard = Integer.parseInt(scanner.nextLine());
        Room room = searchInformation();
        Date date1 = null;
        Date date2 = null;
        try {
            System.out.println("Nhập ngày bắt đầu: ");
            date1 = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
            System.out.println("Nhập ngày kết thúc: ");
            date2 = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
        } catch (ParseException e) {
            System.out.println("parse problem");
        } finally {
            long startDay = date1.getTime();
            long endDay = date2.getTime();
            System.out.println("Số tiền cần phải thanh toán: " + (endDay - startDay) / (1000 * 60 * 60 * 24) * room.getRateRoom() + "vnd");
        }
    }

}
