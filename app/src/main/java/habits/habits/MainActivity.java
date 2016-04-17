package habits.habits;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface Habits = Typeface.createFromAsset(getAssets(), "Tinier.ttf");
        TextView myTextView = (TextView)findViewById(R.id.Habits);
        myTextView.setTypeface(Habits);


        /**
         * Login Button
         * Create connection to button and make it respond to when clicked
         */
        final Button mainLoginBtn = (Button) findViewById(R.id.mainSignInBtn);

        mainLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent registerIntent = new Intent(MainActivity.this, LoginActivity.class);
                MainActivity.this.startActivity(registerIntent);

            }
        });

        /**
         * Register Button
         * Create connection to button and make it respond to when clicked
         */
        final Button mainRegisterBtn = (Button) findViewById(R.id.mainRegisterBtn);


        mainRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent registerIntent = new Intent(MainActivity.this, RegisterActivity.class);
                MainActivity.this.startActivity(registerIntent);

            }
        });
    }

}
