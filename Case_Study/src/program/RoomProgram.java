package program;

import object.Room;
import java.io.*;
import java.util.ArrayList;
public class RoomProgram implements Serializable {
    public static ArrayList<Room> rooms = new ArrayList<>();

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        RoomProgram.rooms = rooms;
    }

    public ArrayList<Room> readerFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("hotel.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        rooms = (ArrayList<Room>) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return rooms;
    }

    public void writerFile() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("hotel.txt", true);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(getRooms());
        objectOutputStream.close();
        fileOutputStream.close();
    }


    public void add() throws IOException, ClassNotFoundException {
        setRooms(readerFile());
        Add.addInformation();
    }

    public void edit() throws IOException, ClassNotFoundException {
        Edit_Show.editInformation();
    }

    public void show() throws IOException, ClassNotFoundException {
        readerFile();
        Edit_Show.showInformation();
    }

    public void search() throws IOException, ClassNotFoundException {
        Search_Bill.searchInformation();
    }

    public void bill() throws IOException, ClassNotFoundException {
        Search_Bill.billRoom();
    }
    public void delete()throws IOException, ClassNotFoundException{
        Delete.deleteInformation();
    }
}


