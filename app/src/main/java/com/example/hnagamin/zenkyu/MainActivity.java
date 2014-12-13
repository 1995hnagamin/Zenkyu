package com.example.hnagamin.zenkyu;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.widget.Toast.*;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lectureUnitsView = (ListView)findViewById(R.id.lectureUnitsVIew);
        renderLectureUnits(lectureUnitsView);
    }

    public void renderLectureUnits(ListView view) {
        LectureUnit[] lectureUnits;
        lectureUnits = new LectureUnit[]{
                new LectureUnit(DOW.Monday, 1, "国語"),
                new LectureUnit(DOW.Monday, 2, "算数"),
                new LectureUnit(DOW.Monday, 3, "理科"),
                new LectureUnit(DOW.Monday, 4, "社会")
        };

        List<String> lectureUnitExprs = new ArrayList<>();
        for (LectureUnit lu : lectureUnits) {
            lectureUnitExprs.add(lu.toString());
        }
        ArrayAdapter<String> lectureUnitsAdapter = new ArrayAdapter<>
                (this, android.R.layout.simple_list_item_1, lectureUnitExprs);

        view.setAdapter(lectureUnitsAdapter);
        view.setOnItemClickListener(new OnLectureUnitsItemClick());
    }

    public class OnLectureUnitsItemClick implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            // Toast.makeText(this, "text", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}