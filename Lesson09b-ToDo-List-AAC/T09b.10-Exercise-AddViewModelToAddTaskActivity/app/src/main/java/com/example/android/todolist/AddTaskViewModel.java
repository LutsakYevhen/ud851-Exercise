package com.example.android.todolist;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.todolist.database.AppDatabase;
import com.example.android.todolist.database.TaskEntry;

public class AddTaskViewModel extends ViewModel {

    private LiveData<TaskEntry> mTask;

    public AddTaskViewModel(AppDatabase database, int taskId) {
        mTask = database.taskDao().loadTaskById(taskId);
    }

    public LiveData<TaskEntry> getmTask() {
        return mTask;
    }
}
