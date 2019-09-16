package org.spacelab.sahara;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;

import org.spacelab.sahara.dashboard.DashboardFragment;
import org.spacelab.sahara.home.HomeFragment;
import org.spacelab.sahara.notifications.NotificationsFragment;

public class MainActivity extends AppCompatActivity implements HomeFragment.OnFragmentInteractionListener, DashboardFragment.OnFragmentInteractionListener, NotificationsFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        updateFragment(HomeFragment.FRAGMENT_HOME);

    }

    private void initViews() {
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    updateFragment(HomeFragment.FRAGMENT_HOME);
                    return true;
                case R.id.navigation_dashboard:
                    updateFragment(DashboardFragment.FRAGMENT_DASHBOARD);
                    return true;
                case R.id.navigation_notifications:
                    updateFragment(NotificationsFragment.FRAGMENT_NOTIFICATIONS);
                    return true;
            }
            return false;
        }
    };

    private void updateFragment(int type) {
        switch (type) {
            case HomeFragment.FRAGMENT_HOME:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_fragment, HomeFragment.newInstance("p1", "p2")).commit();
                break;
            case DashboardFragment.FRAGMENT_DASHBOARD:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_fragment, DashboardFragment.newInstance("p1", "p2")).commit();
                break;
            case NotificationsFragment.FRAGMENT_NOTIFICATIONS:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_fragment, NotificationsFragment.newInstance("p1", "p2")).commit();
                break;
            default:
                break;
        }
    }

    @Override
    public void onFragmentInteraction(int fragmentId, Uri uri) {

    }

}
