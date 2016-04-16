package habits.habits;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        final EditText emailAddress = (EditText) findViewById(R.id.Email_text_forgot);
        final Button restartbtn = (Button) findViewById(R.id.restartbtn_forgot);

        /* Forgot password handling*/
        restartbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(ForgotPasswordActivity.this, LoginActivity.class);
                ForgotPasswordActivity.this.startActivity(registerIntent);
            }
        });
            }
    }

