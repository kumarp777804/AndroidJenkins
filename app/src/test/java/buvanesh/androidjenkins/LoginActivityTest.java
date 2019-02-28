package buvanesh.androidjenkins;

import android.app.Activity;

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

    @Before
    public void setUp(){
        loginActivity = Robolectric.buildActivity(LoginActivity.class).create().get();
    }

    @Test
    public void initTest(){
        Assert.assertNotNull(loginActivity);
    }
}
