package com.example.studysns;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class TabLayout_Adapter extends FragmentStateAdapter {
    private int tabCount;

    public TabLayout_Adapter(@NonNull FragmentActivity fragmentActivity, int tabCount) {
        super(fragmentActivity);
        this.tabCount= tabCount;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return null;
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
