package net.jfabricationgames.notebookclientandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listViewNotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewNotes = (ListView) findViewById(R.id.listViewNotes);

        ArrayList<String> list = new ArrayList<String>();
        list.add("text");
        list.add("another text");
        list.add("more text");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);

        listViewNotes.setAdapter(adapter);

        listViewNotes.setOnItemClickListener((listView, view, position, id) -> noteSelected(listView, position));
    }

    private void noteSelected(AdapterView listView, int position) {
        System.out.println("list view clicked: " + listView.getItemAtPosition(position));
        Intent intent = new Intent(this, NoteActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.main_menu_new_note:

                break;
            case R.id.main_menu_reload:

                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
