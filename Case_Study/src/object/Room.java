package object;

import java.util.Date;

public class Room {
    private int roomNumber;
    private Date startDay;
    private Date endDay;
    private String sizeRoom;
    private double rateRoom;
    private Person person;

    public Room(){}

    public Room(int roomNumber, Date startDay, Date endDay, String sizeRoom, double rateRoom, Person person) {
        this.roomNumber = roomNumber;
        this.startDay = startDay;
        this.endDay = endDay;
        this.sizeRoom = sizeRoom;
        this.rateRoom = rateRoom;
        this.person = person;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }


    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public Date getEndDay() {
        return endDay;
    }

    public void setEndDay(Date endDay) {
        this.endDay = endDay;
    }

    public String getSizeRoom() {
        return sizeRoom;
    }

    public void setSizeRoom(String sizeRoom) {
        this.sizeRoom = sizeRoom;
    }

    public double getRateRoom() {
        return rateRoom;
    }

    public void setRateRoom(double rateRoom) {
        this.rateRoom = rateRoom;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return  "- Thông tin phòng:" + "\n" +
                "Số phòng: " + roomNumber +"\n" +
                "Ngày bắt đầu thuê:" + startDay + "\n" +
                "Ngày kết thúc thuê:" + endDay + "\n" +
                "Loại phòng:" + sizeRoom + "\n" +
                "Giá phòng:" + rateRoom + "vnd" + "\n" +
                "- Thông tin khách thuê:"+ "\n" + person
                ;
    }
}

