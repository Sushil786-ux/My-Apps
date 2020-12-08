package com.example.gridapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView grid;
    ArrayList<String> name=new ArrayList<String>();
    ArrayList<Integer> img=new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid=findViewById(R.id.grid);

        name.add("Java");
        name.add("Android");
        name.add("C++");
        name.add("Kotlin");
        name.add("Python");
        name.add("Asp.net");

        img.add(R.mipmap.ic_launcher_round);
        img.add(R.mipmap.ic_launcher_round);
        img.add(R.mipmap.ic_launcher_round);
        img.add(R.mipmap.ic_launcher_round);
        img.add(R.mipmap.ic_launcher_round);
        img.add(R.mipmap.ic_launcher_round);

        gridadapter adapter=new gridadapter();
        grid.setAdapter(adapter);

    }
    class gridadapter extends BaseAdapter{

        @Override
        public int getCount() {
            return name.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View convertview, ViewGroup viewGroup) {
            View view1= getLayoutInflater().inflate(R.layout.gridlayout,viewGroup,false);
            CircularImageView imgs=view1.findViewById(R.id.imgs);
            TextView names=view1.findViewById(R.id.names);

            imgs.setImageResource(img.get(i));
            names.setText(name.get(i));
            return view1;
        }
    }
}
