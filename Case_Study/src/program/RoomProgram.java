package program;

import object.Person;
import object.Room;

import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class RoomProgram implements Serializable {
    public static ArrayList<Room> rooms = new ArrayList<>();

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        RoomProgram.rooms = rooms;
    }

    public void writerFile(ArrayList<Room> rooms) {
        File file = new File("hotel.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            for (Room room : rooms) {
                fileWriter.append(room.toStringFIle());
                fileWriter.append("\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Room> readerFile() {
        File file = new File("hotel.txt");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            if (!file.exists()) {

                file.createNewFile();
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                int id = Integer.parseInt(split[0]);
                Date startDate = new SimpleDateFormat("dd/MM/yyyy").parse(split[1]);
                Date endDate = new SimpleDateFormat("dd/MM/yyyy").parse(split[2]);
                String sizeRoom = split[3];
                double rateRoom = Double.parseDouble(split[4]);
                String personName = split[5];
                int personAge = Integer.parseInt(split[6]);
                int personID = Integer.valueOf(split[7]);
                Person person = new Person();

                person.setName(personName);
                person.setAge(personAge);
                person.setIdCard(personID);

                Room room = new Room(id, startDate, endDate, sizeRoom, rateRoom, person);
                rooms.add(room);
            }
            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return rooms;
    }


    public void add() {
        setRooms(readerFile());
        Add.addInformation();
        writerFile(rooms);
    }

    public void edit() {
        Edit.editInformation();
    }

    public void show() {
        readerFile();
        for (Room room : getRooms()) {
            System.out.println(room.toString());
        }
    }

    public void search() {
        Search_Bill.searchInformation();
    }

    public void bill() {
        Search_Bill.billRoom();
    }

    public void delete() {
        Delete.deleteInformation();
    }
}


