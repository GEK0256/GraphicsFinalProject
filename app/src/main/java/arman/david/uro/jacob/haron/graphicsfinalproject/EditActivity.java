package arman.david.uro.jacob.haron.graphicsfinalproject;

/**
 * Created by haron on 1/3/2017.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

// an activity to edit a todo item
public class EditActivity extends AppCompatActivity {
    private EditText name;
    private EditText description;
    private EditText priority;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        // find the fields for the data
        name = (EditText) findViewById(R.id.name);
        description = (EditText) findViewById(R.id.description);
        priority = (EditText) findViewById(R.id.priority);

        // fetch the parcelable to-do item from the incoming intent
        TodoItem item = getIntent().getParcelableExtra("item");

        // put the data from the item in the fields
        name.setText(item.getName());
        description.setText(item.getDescription());
        priority.setText(item.getPriority() + "");
    }

    @Override
    public void onBackPressed() {
        // when the user presses "back", we use that as "save" for now
        //   (we'll replace this with ActionBar buttons later)

        // create an intent to return
        Intent returnData = new Intent();

        // create a to-do item that we'll return
        TodoItem item = new TodoItem();
        item.setName(name.getText().toString());
        item.setDescription(description.getText().toString());
        item.setPriority(Integer.parseInt(priority.getText().toString()));
        returnData.putExtra("item", item);

        // set the result to "ok" with the return data
        setResult(RESULT_OK, returnData);

        // WARNING: the super call here MUST appear AFTER setResult
        super.onBackPressed();
    }
}
