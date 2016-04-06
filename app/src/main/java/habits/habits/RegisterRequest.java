package habits.habits;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Matteus on 16-04-05.
 */
public class RegisterRequest extends StringRequest {

    private static final String REGISTER_REQUEST_URL = "http://habits.mrgrodzki.com/register.php";
    private Map<String, String> params;


    public RegisterRequest(String fname, String username, int age, String password, Response.Listener<String> listener){

        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("fname", fname);
        params.put("username", username);
        params.put("age", age + "");
        params.put("password", password);

    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
