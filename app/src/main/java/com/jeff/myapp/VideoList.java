package com.jeff.myapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Environment;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.File;
import java.io.FilenameFilter;

public class VideoList extends ListActivity {

    ArrayAdapter<String> adapter;
ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videolist);

        lv=(ListView)findViewById(android.R.id.list);

        adapter= new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,getVideos());
        setListAdapter(adapter);

        ListView listView=getListView();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String s=adapterView.getItemAtPosition(i).toString();
                Intent intent=new Intent();
                intent.putExtra("video", s);
                intent.setClass(getApplicationContext(),VideoPlayerActivity.class);
                startActivity(intent);

            }
        });
    }


    static String[] string = null;

    public static String[] getVideos() {

        File videos = Environment.getExternalStorageDirectory();
        File[] videolist = videos.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File file, String s) {
                return ((s.endsWith(".mp4") || (s.endsWith(".3gp"))));
            }
        });


        string=new String[videolist.length];
        for(int i=0;i<videolist.length;i++){
            string[i]=videolist[i].getAbsolutePath();
        }
return string;

    }
}
