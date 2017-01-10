package createajavalibrary.com.createajavalibrary;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.JokeSmith;
import com.example.JokeWizard;


public class MainActivityFragment extends Fragment {
    public MainActivityFragment(){
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        JokeSmith myJokeSmith = new JokeSmith();
        String handcrafterJoke = myJokeSmith.tellAHandCraftedJoke();
        TextView handcrafterJokeTextView = (TextView) rootView.findViewById(R.id.handcraftedJokeTextView);
        handcrafterJokeTextView.setText(handcrafterJoke);

        JokeWizard myJokeWizard = new JokeWizard();
        String wizardJoke = myJokeWizard.tellAWizardJoke();
        TextView wizardTextView = (TextView) rootView.findViewById(R.id.wizardJokeTextView);
        wizardTextView.setText(wizardJoke);
        wizardTextView.setTypeface(null, Typeface.BOLD);

        return rootView;
    }
}
