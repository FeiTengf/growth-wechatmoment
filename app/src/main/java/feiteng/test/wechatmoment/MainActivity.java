package feiteng.test.wechatmoment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * This is a holder for the <code>MomentItemsFragment</code>
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //starting momnetItemsFragment.
        FragmentManager fm = getSupportFragmentManager();

        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
        if (fragment == null) {
            fragment = MomentItemsFragment.newInstance();
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }


}
