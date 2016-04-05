package habits.habits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText registerName = (EditText) findViewById(R.id.registerFname);
        final EditText registerUsername = (EditText) findViewById(R.id.registerUsername);
        final EditText registerPassword = (EditText) findViewById(R.id.registerPassword);
        final EditText registerAge = (EditText) findViewById(R.id.registerAge);

        final Button registerBtn = (Button) findViewById(R.id.registerBtn);




    }
}
