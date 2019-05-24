package sg.edu.rp.c346.democontextmenutranslation2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvTranslatedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslatedText=findViewById(R.id.textViewTranslatedText);
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,ContextMenu.ContextMenuInfo menuInfo) {// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        super.onCreateContextMenu(menu, v, menuInfo);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();
        //id refer from menu_main.xml
        if (id == R.id.EnglishSelection) {
            tvTranslatedText.setText("Hello ");
            return true;
        }else if (id == R.id.italianSelection) {
            tvTranslatedText.setText("Ciao");
            return true;
        }else  {
            tvTranslatedText.setText("Error translation");
        }

        return super.onContextItemSelected(item);
    }




}
