package main;
import program.PersonProgram;
import program.RoomProgram;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class Main implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Scanner scanner = new Scanner(System.in);
        PersonProgram personProgram = new PersonProgram();
        RoomProgram roomProgram = new RoomProgram();

        int n = 0;
        do {
            roomProgram.writerFile();
            roomProgram.readerFile();

            System.out.println("------------Menu-------------");
            System.out.println("1. Đăng kí khách thuê");
            System.out.println("2. Hiển thị thông tin khách thuê");
            System.out.println("3. Sửa thông tin khách thuê");
            System.out.println("4. Tìm kiếm khách thuê");
            System.out.println("5. Thanh toán phòng");
            System.out.println("6. Thoát");
            n = Integer.parseInt(scanner.nextLine());
            switch (n) {
                case 1:
                    roomProgram.add();
                    break;
                case 2:
                    roomProgram.show();
                    break;
                case 3:
                    roomProgram.edit();
                    break;
                case 4:
                    roomProgram.search();
                    break;
                case 5:
                    roomProgram.bill();
                    break;
            }
        } while (n != 6);
    }
}
