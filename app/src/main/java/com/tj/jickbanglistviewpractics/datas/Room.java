package com.tj.jickbanglistviewpractics.datas;

public class Room {
    public int deposit;    // 보증금
    public int month_pay;   // 월세
    public String location;    // 주소
    public int floor;  // 몇층인지. 만약 지하라면 음수값. -2
    public String description; //설명 문구

    public Room(int deposit, int month_pay, String location, int floor, String description) {
        this.deposit = deposit;
        this.month_pay = month_pay;
        this.location = location;
        this.floor = floor;
        this.description = description;
    }
}
