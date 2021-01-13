package com.my.viewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import com.my.viewmodel.Fragments.fragment1;
import com.my.viewmodel.Fragments.fragment2;
import com.my.viewmodel.databinding.ActivityMainBinding;
import co.ceryle.radiorealbutton.RadioRealButton;
import co.ceryle.radiorealbutton.RadioRealButtonGroup;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager=getSupportFragmentManager();
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);


        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
        RadioRealButtonGroup group = (RadioRealButtonGroup) findViewById(R.id.group);
//---------------------------casting--------------------------------------------------------------------------



        group.setOnClickedButtonListener(new RadioRealButtonGroup.OnClickedButtonListener() {
            @Override
            public void onClickedButton(RadioRealButton button, int position) {
                if (position==0)
                {
                    FragmentTransaction ft= fragmentManager.beginTransaction();
                    ft.replace( R.id.frame1,new fragment1());
                    ft.commit();
                }
                else if (position==1)
                {
                    FragmentTransaction ft= fragmentManager.beginTransaction();
                    ft.replace( R.id.frame1,new fragment2());
                    ft.commit();
                }
            }
        });



    }
}