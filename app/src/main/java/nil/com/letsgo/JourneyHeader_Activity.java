package nil.com.letsgo;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class JourneyHeader_Activity extends AppCompatActivity {
    final SQLiteDatabase db = this.openOrCreateDatabase("journey.db", MODE_PRIVATE, null);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journey_header);
        final String CREATE_JOURNEY_TABLE = "CREATE TABLE IF NOT EXISTS journey_list ("
                + "id INTEGER primary key AUTOINCREMENT,"
                + "name TEXT,"
                + "flag TEX)";
        db.execSQL(CREATE_JOURNEY_TABLE);
    }

    public void redirectToPlace(View view){
        EditText journeyHeaderText = (EditText) findViewById(R.id.headerText);
        db.execSQL("INSERT INTO book_list (name, flag) VALUES (journeyHeaderText.getText(), 'Ys')");
        Intent i = new Intent(getApplicationContext(),AddPlace_Activity.class);
        startActivity(i);
    }
}
