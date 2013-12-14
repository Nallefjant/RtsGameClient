package rts.game.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.GridView;
import rts.game.R;
import rts.game.activities.Adapters.ImageAdapter;

public class LaunchActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


    }
    @Override
    public void onResume(){
        super.onResume();

        GridView mapGridView = (GridView) findViewById(R.id.map);
        mapGridView.setAdapter(new ImageAdapter(this, getWindowManager()));
    }
}
