package sg.edu.rp.c346.demoandroidlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import sg.edu.rp.c346.demoandroidlist.R;

public class MainActivity extends AppCompatActivity {

    ListView lvAndroidList;
    ArrayList<AndroidVersion> androidVersionArrayList = new ArrayList<AndroidVersion>();
    ArrayAdapter<String> aaVersion;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroidList = findViewById(R.id.listViewMovie);

        androidVersionArrayList.add(new AndroidVersion("Pie ", "9.0"));
        androidVersionArrayList.add(new AndroidVersion("Oreo", "8.0 - 8.1"));
        androidVersionArrayList.add(new AndroidVersion("Nougat", "7.0 - 7.1.2"));

        //aaVersion = new ArrayAdapter(this,android.R.layout.simple_list_item_1,androidVersionArrayList);
        adapter = new CustomAdapter(this, R.layout.row,androidVersionArrayList);
        //lvAndroidList.setAdapter(aaVersion);
        lvAndroidList.setAdapter(adapter);



    }
}