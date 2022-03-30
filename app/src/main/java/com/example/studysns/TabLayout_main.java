package com.example.studysns;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class TabLayout_main extends Fragment {

    private View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view  = (ViewGroup) inflater.inflate(R.layout.fragment_tab, container, false);

        TabLayout tabs = null;

        studyList1 fragment1;
        studyList2 fragment2;
        studyList3 fragment3;

        fragment1 = new studyList1();
        fragment2 = new studyList2();
        fragment3 = new studyList3();


        tabs = view.findViewById(R.id.tabs);

        getActivity().getSupportFragmentManager().beginTransaction().add(R.id.container, fragment1).commit();

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                Fragment selected = null;
                if (position == 0)
                    selected = fragment1;
                else if (position == 1)
                    selected = fragment2;
                else if (position == 2)
                    selected = fragment3;
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, selected).commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });
        return view;
    }
}
