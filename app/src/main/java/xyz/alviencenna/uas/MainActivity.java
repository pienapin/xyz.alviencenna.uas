package xyz.alviencenna.uas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                CharSequence title = item.getTitle();

                switch (id) {
                    case R.id.home:
                        fragmentManager.beginTransaction().replace(R.id.container, new fragmentHome()).commit();
                        mDrawerLayout.close();
                        Toast.makeText(MainActivity.this, title + " selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.about:
                        fragmentManager.beginTransaction().replace(R.id.container, new fragmentAbout()).commit();
                        mDrawerLayout.close();
                        Toast.makeText(MainActivity.this, title + " selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.portfolio:
                        fragmentManager.beginTransaction().replace(R.id.container, new fragmentPortfolio()).commit();
                        mDrawerLayout.close();
                        Toast.makeText(MainActivity.this, title + " selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.blog:
                        fragmentManager.beginTransaction().replace(R.id.container, new fragmentBlog()).commit();
                        mDrawerLayout.close();
                        Toast.makeText(MainActivity.this, title + " selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.contact:
                        fragmentManager.beginTransaction().replace(R.id.container, new fragmentContact()).commit();
                        mDrawerLayout.close();
                        Toast.makeText(MainActivity.this, title + " selected", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });

        mDrawerLayout = findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.buka, R.string.tutup);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}