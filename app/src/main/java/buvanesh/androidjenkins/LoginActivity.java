package buvanesh.androidjenkins;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {


    // UI references.
    private EditText mEmailView;
    private EditText mPasswordView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // Set up the login form.
        mEmailView = (EditText) findViewById(R.id.email);

        mPasswordView = (EditText) findViewById(R.id.password);

        Button mEmailSignInButton = (Button) findViewById(R.id.email_sign_in_button);
        
         mEmailSignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!TextUtils.isEmpty(mEmailView.getText().toString())&&!TextUtils.isEmpty(mPasswordView.getText().toString())){
                    startActivity(new Intent(LoginActivity.this,DashboardActivity.class));
                }else{
                    Toast.makeText(LoginActivity.this,"UserName or Password cannot be empty",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}

