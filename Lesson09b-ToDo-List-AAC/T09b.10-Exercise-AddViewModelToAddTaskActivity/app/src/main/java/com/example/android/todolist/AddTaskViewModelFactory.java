package com.example.android.todolist;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.example.android.todolist.database.AppDatabase;

public class AddTaskViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private final AppDatabase mAppDatabase;
    private final int mTaskId;

    public AddTaskViewModelFactory(AppDatabase mAppDatabase, int mTaskId) {
        this.mAppDatabase = mAppDatabase;
        this.mTaskId = mTaskId;
    }

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        //noinspection unchecked
        return (T) new AddTaskViewModel(mAppDatabase, mTaskId);
    }
}
