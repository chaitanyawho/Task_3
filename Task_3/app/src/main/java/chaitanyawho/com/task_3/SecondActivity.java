package chaitanyawho.com.task_3;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.text1);
        textView.setText(message);
        View coordinatorLayout=findViewById(R.id.snackbarPosition);
        Snackbar snackbar = Snackbar
                .make(coordinatorLayout, "Second Activity", Snackbar.LENGTH_LONG);
        snackbar.show();




        //

    }
}
