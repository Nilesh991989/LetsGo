package nil.com.letsgo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startJourney(View view){
        Button button = findViewById(view.getId());
        Intent i = new Intent(getApplicationContext(),AddPlace_Activity.class);
        startActivity(i);
    }
}
