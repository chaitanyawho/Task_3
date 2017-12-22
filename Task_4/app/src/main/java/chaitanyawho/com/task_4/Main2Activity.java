package chaitanyawho.com.task_4;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Get the Intent that started this activity and extract the string
        Bundle bundle = getIntent().getExtras();
        try {
            String movie = bundle.getString("key_m");
            String tvshow = bundle.getString("key_tv");

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.text1);
        textView.setText("Your movie: "+movie+"\nYour TV show: "+tvshow);
        }
        catch (NullPointerException e){
            System.out.println(e);
            System.exit(0);
        }

    }
}
