package nn.vv.ss.testaap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;


public class MainActivity extends AppCompatActivity {

    final int rounds = 100000000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.startExerciser();
    }

    private void startExerciser() {
        AttributeSet attribs = null;
        int defaultStyle = 0;

        Exerciser exerciser = new TestExerciser(this, (ViewGroup) findViewById(R.id.rootView));

        for(int i=0; i<this.rounds; i++) {
            exerciser.exercise();
        }
    }

}

