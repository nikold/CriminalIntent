package com.example.nikol.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by nikol on 26.08.2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
