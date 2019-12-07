package net.jfabricationgames.notebook.client.android.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TimePicker;

import net.jfabricationgames.notebookclientandroid.R;

import java.util.Arrays;
import java.util.List;

public class NoteActivity extends AppCompatActivity {

    private EditText headline;
    private EditText noteContent;
    private Spinner priority;

    private DatePicker executionDate;
    private TimePicker executionTime;
    private DatePicker reminderDate;
    private TimePicker reminderTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        headline = (EditText) findViewById(R.id.editTextHeadline);
        noteContent = (EditText) findViewById(R.id.editTextNoteContent);
        priority = (Spinner) findViewById(R.id.spinnerPriority);
        executionDate = (DatePicker) findViewById(R.id.editTextExecutionDate);
        executionTime = (TimePicker) findViewById(R.id.editTextExecutionTime);
        reminderDate = (DatePicker) findViewById(R.id.editTextReminderDate);
        reminderTime = (TimePicker) findViewById(R.id.editTextReminderTime);

        List<Integer> priorityValues = Arrays.asList(1, 2, 3, 4, 5);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, priorityValues);
        priority.setAdapter(adapter);
    }

    @Override
    public void onStop() {
        super.onStop();
        //TODO save changes
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.note_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.note_menu_delete_note:

                break;
            case R.id.note_menu_delete_execution_date:

                break;
            case R.id.note_menu_delete_reminder_date:

                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}