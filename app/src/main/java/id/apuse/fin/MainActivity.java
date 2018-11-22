package id.apuse.fin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void order(View view){
        Intent next = new Intent(this, Menu.class);
        startActivity(next);
    }
    public void about(View view){
        Intent next2 = new Intent(this, Main2Activity.class);
        startActivity(next2);
    }
}
