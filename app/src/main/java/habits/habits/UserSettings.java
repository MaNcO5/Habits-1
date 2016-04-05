package habits.habits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UserSettings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_settings);

        final EditText accountSettingsUsername = (EditText) findViewById(R.id.accountSettingsUsername);
        final EditText accountSettingsAge = (EditText) findViewById(R.id.accountSettingsAge);
        final TextView accountSettingsMsg = (TextView) findViewById(R.id.accountSettingsMsg);
    }
}
