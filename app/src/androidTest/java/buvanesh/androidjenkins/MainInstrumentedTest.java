package buvanesh.androidjenkins;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;

public class MainInstrumentedTest extends ActivityInstrumentationTestCase2<LoginActivity> {
    public MainInstrumentedTest() {
        super("buvanesh.androidjenkins",LoginActivity.class);
    }

    public void testUI(){
        Activity activity = getActivity();

        final Button button = (Button)activity.findViewById(R.id.email_sign_in_button);
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {

            button.performClick();
            }
        });

    }
}
