package chaitanyawho.com.task_3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView txt;
    public static final String EXTRA_MESSAGE = "Task 3 done";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button =(Button) findViewById(R.id.button_id);
        //txt=(TextView)findViewById(R.id.text1);

        //after activity1
        Context context = getApplicationContext();
        CharSequence text = "Application started!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        String message = "Task 3 done";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
