package ge.newton.myauthorisationappnewtonge;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
//import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ourMainButton = findViewById(R.id.button4);
        TextView text = findViewById(R.id.text);

        Random colourRand = new Random();

        Random textRand = new Random();


        String[] adj = {"Big", "Brown", "Small", "Yellow", "Slow", "Smelly", "Funky", "Fugly", "Thin"};
        String[] noun = {"ball", "book", "phone", "human", "dog", "skunk", "laptop", "frog", "monkey"};
        String[] verb = {"running", "falling", "yelling", "playing", "cooking", "crying", "dancing", "reading", "studying", "working"};

        ourMainButton.setOnClickListener(view -> {

            int r = colourRand.nextInt(255);
            int g = colourRand.nextInt(255);
            int b = colourRand.nextInt(255);

            text.setTextColor(Color.rgb(r,g,b));
            text.setText( adj[textRand.nextInt(8)] + " " + noun[textRand.nextInt(8)] + " " + verb[textRand.nextInt(9)] );

        });
    }
}