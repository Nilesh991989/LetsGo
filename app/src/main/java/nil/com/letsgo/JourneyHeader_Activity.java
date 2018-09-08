package nil.com.letsgo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JourneyHeader_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journey_header);
    }

    public void redirectToPlace(View view){
        Intent i = new Intent(getApplicationContext(),AddPlace_Activity.class);
        startActivity(i);
    }
}
