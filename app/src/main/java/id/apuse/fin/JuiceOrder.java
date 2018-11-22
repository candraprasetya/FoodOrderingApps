package id.apuse.fin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.Locale;

public class JuiceOrder extends AppCompatActivity {

    int quantity = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juice_order);
    }

    public void decrement(View view){
        if (quantity<1){
            Toast.makeText(this,"Minimum Order 1",Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity - 1;
        display(quantity);
    }

    public void increment(View view){
        quantity = quantity + 1;
        display(quantity);
    }

    public void submitOrder(View view){
        TextView Youtube = (TextView) findViewById(R.id.you);
        String priceMessage = "You Ordered " + quantity + " Juices";
        Youtube.setText(priceMessage);
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(formatRupiah.format(quantity * 5000));
        Toast.makeText(this, "Order Success", Toast.LENGTH_SHORT).show();
    }

    private void display(int number) {
        TextView quantityTextView = (TextView)findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number){
        TextView priceTextView = (TextView)findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    private void displayMessage(String message){
        TextView priceTextView = (TextView)findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}
