package criminalintent.android.bignerdranch.com.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by mehagar on 3/2/2015.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
