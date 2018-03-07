package com.example.pok.lab3_v2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by pok on 24/2/2561.
 */

public class CustomAdapter extends BaseAdapter {

    Context mContext;

    String[] strName;
    String[] phoneNum;
    String[] imgg;


    public CustomAdapter(Context context, String[] strName, String[] phoneNum,String[] imgg){
        mContext = context;
        this.strName = strName;
        this.phoneNum = phoneNum;
        this.imgg = imgg;

    }

    @Override
    public int getCount() {
        return strName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater mInflater = (LayoutInflater)mContext.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);

        if(convertView == null)
            convertView = mInflater.inflate(R.layout.listview_row, parent, false);

        TextView textView = (TextView)convertView.findViewById(R.id.textView1);
        textView.setText(strName[position]);

        TextView textView2 = (TextView)convertView.findViewById(R.id.textView2);
        textView2.setText(phoneNum[position]);

        ImageView ImageView = (ImageView)convertView.findViewById(R.id.imageView2);
        ImageView.setImageBitmap(BitmapFactory.decodeFile(imgg[position]));

        return convertView;
    }
}
