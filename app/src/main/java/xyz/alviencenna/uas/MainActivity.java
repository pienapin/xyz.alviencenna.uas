package xyz.alviencenna.uas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottomnavbar);

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.container, new fragmentHome()).commit();
        BottomNavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setSelectedItemId(R.id.home);
        navigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        int id = item.getItemId();
                        CharSequence title = item.getTitle();

                        switch (id) {
                            case R.id.home:
                                fragmentManager.beginTransaction().replace(R.id.container, new fragmentHome()).commit();
                                Toast.makeText(MainActivity.this, title + " selected", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.about:
                                fragmentManager.beginTransaction().replace(R.id.container, new fragmentAbout()).commit();
                                Toast.makeText(MainActivity.this, title + " selected", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.portfolio:
                                fragmentManager.beginTransaction().replace(R.id.container, new fragmentPortfolio()).commit();
                                Toast.makeText(MainActivity.this, title + " selected", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.blog:
                                fragmentManager.beginTransaction().replace(R.id.container, new fragmentBlog()).commit();
                                Toast.makeText(MainActivity.this, title + " selected", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.contact:
                                fragmentManager.beginTransaction().replace(R.id.container, new fragmentContact()).commit();
                                Toast.makeText(MainActivity.this, title + " selected", Toast.LENGTH_SHORT).show();
                                break;
                        }
                        return true;
                    }

                });
    }

}