package program;

import object.Room;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Search_Bill {

    public static Room searchInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số chứng minh thư khách thuê: ");
        try {
            int idCard = Integer.parseInt(scanner.nextLine());
            for (Room room : RoomProgram.rooms) {
                if (idCard == room.getPerson().getIdCard()) {
                    System.out.println(room.toString());
                    return room;
                }
            }
        } catch (Exception e) {
            System.out.println("Mời bạn nhập lại");
        }
        return null;
    }

    public static void billRoom() {
        Scanner scanner = new Scanner(System.in);
        Room room = searchInformation();
        Date date1 = null;
        Date date2 = null;
        try {
            System.out.println("Nhập ngày bắt đầu: ");
            date1 = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
            System.out.println("Nhập ngày kết thúc: ");
            date2 = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
        } catch (ParseException e) {
            System.out.println("Mời bạn nhập lại");
        }
        finally {
            long startDay = date1.getTime();
            long endDay = date2.getTime();
            System.out.println("Số tiền cần phải thanh toán: " + (endDay - startDay) / (1000 * 60 * 60 * 24) * room.getRateRoom() + "vnd");
        }

    }

}

