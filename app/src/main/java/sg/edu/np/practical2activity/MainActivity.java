package sg.edu.np.practical2activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private final static String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG, "On Create Main Activity!");

        User user1 = new User("John","man",
                1001, false);

        Button button = findViewById(R.id.followbutton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (user1.isFollowed() == false) {
                    button.setText("Unfollow");
                    user1.setFollowed(true);
                    Log.v(TAG, "Followed!");

                }
                else if (user1.isFollowed() == true) {
                    button.setText("Follow");
                    user1.setFollowed(false);
                    Log.v(TAG, "Unfollowed!");
                }
            }
        });






    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "On Start!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "On Resume!");
    }

    @Override
    protected void onPause (){
        super.onPause();
        Log.v(TAG,"On Pause!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "On Stop!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "On Destroy!");
    }



}