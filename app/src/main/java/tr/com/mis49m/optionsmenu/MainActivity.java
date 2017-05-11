package tr.com.mis49m.optionsmenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        RelativeLayout mainLayout = (RelativeLayout) findViewById(R.id.layout);

        item.setChecked(!item.isChecked());

        int id = item.getItemId();
        switch (id){
            case R.id.action_red:
                mainLayout.setBackgroundColor(Color.RED);
                return true;
            case R.id.action_green:
                mainLayout.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.action_blue:
                mainLayout.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.action_yellow:
                mainLayout.setBackgroundColor(Color.YELLOW);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
