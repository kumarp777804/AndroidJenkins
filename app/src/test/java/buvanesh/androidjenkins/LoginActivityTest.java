package buvanesh.androidjenkins;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class LoginActivityTest {
    LoginActivity loginActivity;
    EditText edtUser;
    EditText edtPassword;
    Button btnLogin;

    @Before
    public void setUp(){
        loginActivity = Robolectric.buildActivity(LoginActivity.class).create().get();
        edtUser = (EditText)loginActivity.findViewById(R.id.email);
        edtPassword = (EditText)loginActivity.findViewById(R.id.password);
        btnLogin = (Button) loginActivity.findViewById(R.id.email_sign_in_button);

    }

    @Test
    public void initTest(){
        Assert.assertNotNull(loginActivity);
        btnLogin.performClick();
        edtUser.setText("User");
        edtPassword.setText("Password");
        btnLogin.performClick();
    }
}
