package com.example.studysns;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class studyList1 extends Fragment {

    private ArrayList<RecyclerItem> list = new ArrayList<RecyclerItem>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_study_list1, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstance){
        super.onViewCreated(view, savedInstance);
        RecyclerView recyclerView = view.findViewById(R.id.RecyclerView);
        RecyclerItemAdapter recyclerItemAdapter = new RecyclerItemAdapter(this.list);

        recyclerView.setAdapter(recyclerItemAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        addRecyclerItem("Build", "ㅇㅇㅇ", "안드로이드/자바", "기간", "2021.05.10~14", "모집인원", "5", "/", "10");
        recyclerItemAdapter.notifyDataSetChanged();


    }

    private void addRecyclerItem(String title, String rep, String category, String term, String Tdata, String StudySize,String Sdata0,String slash, String Sdata1){
        RecyclerItem recyclerItem = new RecyclerItem();
        recyclerItem.setTitle(title);
        recyclerItem.setRep(rep);
        recyclerItem.setCategory(category);
        recyclerItem.setTerm(term);
        recyclerItem.setTdata(Tdata);
        recyclerItem.setStudySize(StudySize);
        recyclerItem.setSdata0(Sdata0);
        recyclerItem.setSlash(slash);
        recyclerItem.setSdata1(Sdata1);
        list.add(recyclerItem);

    }
}