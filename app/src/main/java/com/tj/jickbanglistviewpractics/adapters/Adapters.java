package com.tj.jickbanglistviewpractics.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.tj.jickbanglistviewpractics.R;
import com.tj.jickbanglistviewpractics.datas.Room;

import java.util.List;

public class Adapters extends ArrayAdapter<Room> {

    Context mContext;
    List<Room> mList;
    LayoutInflater inf;

    public Adapters(Context context, List<Room> list){
         super(context, R.layout.room_list_item, list);

         mContext = context;
         mList = list;
         inf = LayoutInflater.from(mContext);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if (row == null){
            row = inf.inflate(R.layout.room_list_item, null);

        }
        Room roomData = mList.get(position);

        TextView depositAndMonthPayTxt = row.findViewById(R.id.depositAndMonthPayTxt);
        TextView locationTxt = row.findViewById(R.id.locationTxt);
        TextView floorTxt = row.findViewById(R.id.floorTxt);
        TextView descriptionTxt = row.findViewById(R.id.descriptionTxt);

        depositAndMonthPayTxt.setText(String.format("%d / %d",roomData.deposit, roomData.month_pay));
        floorTxt.setText(roomData.floor);
        locationTxt.setText(roomData.location);
        descriptionTxt.setText(roomData.description);


        return  row;
    }
}

