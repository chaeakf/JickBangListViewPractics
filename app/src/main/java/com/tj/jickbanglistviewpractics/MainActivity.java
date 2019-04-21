package com.tj.jickbanglistviewpractics;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tj.jickbanglistviewpractics.adapters.Adapters;
import com.tj.jickbanglistviewpractics.databinding.ActivityMainBinding;
import com.tj.jickbanglistviewpractics.datas.Room;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Adapters mAdapers;

    List<Room> roomList = new ArrayList<>();

    ActivityMainBinding act;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act = DataBindingUtil.setContentView(this,R.layout.activity_main);

        fillRoom();

        mAdapers = new Adapters(MainActivity.this, roomList);
        act.roomListView.setAdapter(mAdapers);
    }


    void fillRoom() {
        roomList.add(new Room(100,13,"경상북도 구미시 송정동",2,"분리형원룸"));
        roomList.add(new Room(100,15,"경상북도 구미시 신평동",3,"분리형원룸"));
        roomList.add(new Room(100,13,"경상북도 구미시 원평동",3,"분리형원룸"));
        roomList.add(new Room(100,13,"경상북도 구미시 형곡동",2,"분리형원룸"));
        roomList.add(new Room(100,13,"경상북도 구미시 신평동",2,"분리형원룸"));
       }
}
