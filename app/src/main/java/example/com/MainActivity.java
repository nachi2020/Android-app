package example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button share;
Button subscribe;
TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        share = (Button)findViewById(R.id.btn1);
        subscribe = (Button)findViewById(R.id.btn2);
        txt = (TextView)findViewById(R.id.txt);

        share.setOnClickListener(this);
        subscribe.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId(R.id.btn1)){
            txt.setText("SHARE button is clicked");
        }
        if(v.getId(R.id.btn2)){
            txt.setText("SUBSCRIBE button is clicked");
        }
    }
}