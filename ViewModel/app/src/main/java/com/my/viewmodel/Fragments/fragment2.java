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
import com.my.viewmodel.databinding.FragmenttwoBinding;
import com.my.viewmodel.model.ModelFragments;
import com.my.viewmodel.viewmodel.Viewmodel2;
import lal.adhish.gifprogressbar.GifView;

public class fragment2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        FragmenttwoBinding binding= DataBindingUtil.inflate(inflater, R.layout.
                fragmenttwo,null,false);
        binding.setModeltwo(new Viewmodel2(new ModelFragments("log up")));
        View view=binding.getRoot();

        GifView gif2=view.findViewById(R.id.Gif2);
        gif2.setImageResource(R.drawable.gif2);

        return view;
    }
}
