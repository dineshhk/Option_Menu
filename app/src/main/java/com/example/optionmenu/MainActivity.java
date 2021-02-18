package com.example.optionmenu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.search_item:
                Toast.makeText(this, "Selected Item: Search", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.upload_item:
                Toast.makeText(this, "Selected Item: Upload", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.copy_item:
                Toast.makeText(this, "Selected Item: Copy", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.print_item:
                Toast.makeText(this, "Selected Item: Print", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.share_item:
                Toast.makeText(this, "Selected Item: Share", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.bookmark_item:
                Toast.makeText(this, "Selected Item: Bookmark", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}