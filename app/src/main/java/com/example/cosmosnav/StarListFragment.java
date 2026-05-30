package com.example.cosmosnav;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import androidx.fragment.app.ListFragment;

public class StarListFragment extends ListFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        String[] celestialBodies = {
                "☀️  The Sun",
                "🪐  Saturn",
                "🌍  Earth",
                "🔴  Mars",
                "💙  Neptune",
                "⭐  Sirius",
                "🌟  Betelgeuse",
                "🌙  The Moon",
                "☄️  Halley's Comet",
                "🌠  Andromeda"
        };

        ArrayAdapter<String> starAdapter = new ArrayAdapter<>(
                requireActivity(),
                android.R.layout.simple_list_item_1,
                celestialBodies
        );
        setListAdapter(starAdapter);
    }
}