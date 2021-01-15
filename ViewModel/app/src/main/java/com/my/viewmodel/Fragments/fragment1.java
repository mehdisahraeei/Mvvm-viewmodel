package com.my.viewmodel.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import com.my.viewmodel.R;
import com.my.viewmodel.databinding.FragmentoneBinding;
import com.my.viewmodel.model.ModelFragments;
import com.my.viewmodel.viewmodel.Viewmodel1;
import lal.adhish.gifprogressbar.GifView;


public class fragment1 extends Fragment {



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        FragmentoneBinding binding= DataBindingUtil.inflate(inflater, R.layout.
                fragmentone,null,false);
        binding.setModelone(new Viewmodel1(new ModelFragments("login")));
        View view=binding.getRoot();

        GifView gif1=view.findViewById(R.id.Gif1);
        gif1.setImageResource(R.drawable.gif1);


        return view;
    }
}