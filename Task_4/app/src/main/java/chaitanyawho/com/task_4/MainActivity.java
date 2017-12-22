package chaitanyawho.com.task_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, Main2Activity.class);

        EditText editText1 = (EditText) findViewById(R.id.movie_name);
        String movie = editText1.getText().toString();
        EditText editText2=(EditText) findViewById(R.id.tv_name);
        String tvshow = editText2.getText().toString();
        Bundle bundle=new Bundle();
        bundle.putString("key_m", movie);
        bundle.putString("key_tv", tvshow);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}