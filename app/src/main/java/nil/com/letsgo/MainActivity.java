package nil.com.letsgo;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    final SQLiteDatabase db = this.openOrCreateDatabase("journey.db", MODE_PRIVATE, null);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String CREATE_JOURNEY_TABLE = "CREATE TABLE IF NOT EXISTS journey_list ("
                + "id INTEGER primary key AUTOINCREMENT,"
                + "name TEXT,"
                + "flag TEX)";
        db.execSQL(CREATE_JOURNEY_TABLE);

        List<journey_list> journey_lists = new ArrayList<>();
        Cursor cursorJourney = db.rawQuery("SELECT * FROM journey_list where flag = 'Y'", null);

        if (cursorJourney.moveToFirst()) {
            do {
                journey_lists.add(new journey_list(
                        cursorJourney.getInt(0),
                        cursorJourney.getString(1),
                        cursorJourney.getString(2)
               ));
            } while (cursorJourney.moveToNext());
        }
        cursorJourney.close();

        if(!journey_lists.isEmpty()){
            Intent i = new Intent(getApplicationContext(),JourneySummary_Activity.class).putExtra("id",journey_lists.get(0).getId());
            startActivity(i);
        }
    }

    public void startJourney(View view){
        Button button = findViewById(view.getId());
        Intent i = new Intent(getApplicationContext(),JourneyHeader_Activity.class);
        startActivity(i);
    }
}
