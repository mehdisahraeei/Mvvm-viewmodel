package com.my.viewmodel.viewmodel;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.my.viewmodel.BR;
import com.my.viewmodel.model.ModelFragments;

public class Viewmodel2 extends BaseObservable {

    public String title;

    public Viewmodel2(ModelFragments model) {
        this.title=model.title;
    }

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(BR.title);
    }
}
