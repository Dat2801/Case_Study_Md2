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
        this.rooms = rooms;
    }

    public ArrayList<Room> readerFile() throws IOException, ClassNotFoundException {
        FileInputStream fileOutputStream = new FileInputStream("hotel.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileOutputStream);
        rooms = (ArrayList<Room>) objectInputStream.readObject();
        objectInputStream.close();
        fileOutputStream.close();
        return rooms;
    }

    public void writerFile() throws IOException, ClassNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("hotel.txt");
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
        Edit.editInformation();
    }

    public void show() throws IOException, ClassNotFoundException {
        writerFile();
        readerFile();
        Edit.showInformation();
    }

    public void search() throws IOException, ClassNotFoundException {
        Search.searchInformation();
    }

    public void bill() throws IOException, ClassNotFoundException {
        Search.billRoom();
    }
}


