package id.apuse.fin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void menu1(View view){
        Intent next1 = new Intent(this, BurgerOrder.class);
        startActivity(next1);
    }

    public void menu2(View view){
        Intent next2 = new Intent(this, CakeOrder.class);
        startActivity(next2);
    }

    public void menu3(View view){
        Intent next3 = new Intent(this, CoffeeOrder.class);
        startActivity(next3);
    }

    public void menu4(View view){
        Intent next4 = new Intent(this, IcecreamOrder.class);
        startActivity(next4);
    }

    public void menu5(View view){
        Intent next5 = new Intent(this, JuiceOrder.class);
        startActivity(next5);
    }
}
