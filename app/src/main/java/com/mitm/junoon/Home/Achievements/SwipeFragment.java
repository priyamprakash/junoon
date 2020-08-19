package com.mitm.junoon.Home.Achievements;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.mitm.junoon.R;

//import static com.mitm.junoon.Home.Achievements.Achievements.IMAGE_NAME;

public  class SwipeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View swipeView = inflater.inflate(R.layout.swipe_fragment, container, false);
        ImageView imageView = swipeView.findViewById(R.id.imageView1);

        Bundle bundle = getArguments();
     /*   int position = bundle.getInt("position");
        String imageFileName = IMAGE_NAME[position];
        int imgResId = getResources().getIdentifier(imageFileName, "drawable", "com.javapapers" +
                ".android.swipeimageslider");
        imageView.setImageResource(imgResId);

    */
        return swipeView;
    }

   public static SwipeFragment newInstance(int position) {
        SwipeFragment swipeFragment = new SwipeFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("position", position);
        swipeFragment.setArguments(bundle);
        return swipeFragment;
    }
}
