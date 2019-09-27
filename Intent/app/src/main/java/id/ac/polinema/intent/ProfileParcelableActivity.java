package id.ac.polinema.intent;


import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileParcelableActivity extends AppCompatActivity {

    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        // TODO: bind here
        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            // TODO: display value here
            String username = (String) extras.getString("USERNAME_KEY");
            usernameText.setText(username);
            String name = (String) extras.getString("NAME_KEY");
            nameText.setText(name);
            int age = (int) extras.getInt("AGE_KEY");
            ageText.setText(String.valueOf(age));
        }
    }
}
