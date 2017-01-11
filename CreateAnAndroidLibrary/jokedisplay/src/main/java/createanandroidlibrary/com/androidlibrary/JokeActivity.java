package createanandroidlibrary.com.androidlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by T510 Owner on 1/10/2017.
 */

public class JokeActivity extends AppCompatActivity {

    public static String JOKE_KEY = "Joke key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
    }

}
