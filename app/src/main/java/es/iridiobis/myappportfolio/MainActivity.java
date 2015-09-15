package es.iridiobis.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    
    @OnClick(R.id.main_spotify)
    public void startSpotifyStreamer() {
        final String desc = String.format(getString(R.string.main_desc_base), getString(R.string.main_spotify_desc));
        Toast.makeText(this, desc, Toast.LENGTH_LONG).show();
    }

    @OnClick(R.id.main_scores)
    public void startScoresApp() {
        final String desc = String.format(getString(R.string.main_desc_base), getString(R.string.main_scores_desc));
        Toast.makeText(this, desc, Toast.LENGTH_LONG).show();
    }

    @OnClick(R.id.main_library)
    public void startLibraryApp() {
        final String desc = String.format(getString(R.string.main_desc_base), getString(R.string.main_library_desc));
        Toast.makeText(this, desc, Toast.LENGTH_LONG).show();
    }

    @OnClick(R.id.main_bigger)
    public void startBuildItBiggerApp() {
        final String desc = String.format(getString(R.string.main_desc_base), getString(R.string.main_bigger_desc));
        Toast.makeText(this, desc, Toast.LENGTH_LONG).show();
    }

    @OnClick(R.id.main_reader)
    public void startXYZReader() {
        final String desc = String.format(getString(R.string.main_desc_base), getString(R.string.main_reader_desc));
        Toast.makeText(this, desc, Toast.LENGTH_LONG).show();
    }

    @OnClick(R.id.main_capstone)
    public void startCapstone() {
        final String desc = String.format(getString(R.string.main_desc_base), getString(R.string.main_capstone_desc));
        Toast.makeText(this, desc, Toast.LENGTH_LONG).show();
    }
}
