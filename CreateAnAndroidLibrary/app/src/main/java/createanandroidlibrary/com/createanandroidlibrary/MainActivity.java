package createanandroidlibrary.com.createanandroidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import createanandroidlibrary.com.androidlibrary.JokeActivity;
import com.example.JokeSupply;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void launchJokeActivity(View view) {
        //  Creating an Intent to start the JokeActivity.class Android Library you created.
        Intent intent = new Intent(this, JokeActivity.class);
        //  Create the jokeSource by importing the class from the Java library you created
        JokeSupply jokeSource = new JokeSupply();
        //  Get the joke by using the method from the imported Java class you just imported
        String joke = jokeSource.getJoke();
        //  package the joke as an intent extra and launch the activity within the Android library.
        intent.putExtra(JokeActivity.JOKE_KEY, joke);
        startActivity(intent);

        //  TODO uses the getJoke method within Java library and passes it as intent extra to android library
    }
}
