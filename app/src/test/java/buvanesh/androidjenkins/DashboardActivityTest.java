package buvanesh.androidjenkins;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class DashboardActivityTest {
    DashboardActivity dashboardActivity;

    @Before
    public void setUp(){
        dashboardActivity = Robolectric.buildActivity(DashboardActivity.class).create().get();

    }

    @Test
    public void initTest(){
        Assert.assertNotNull(dashboardActivity);
    }
}
