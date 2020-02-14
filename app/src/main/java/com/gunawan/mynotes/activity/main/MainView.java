package com.gunawan.mynotes.activity.main;

import com.gunawan.mynotes.model.Note;

import java.util.List;

public interface MainView {
    void showLoading();
    void hideLoading();
    void onGetResult(List<Note> notes);
    void onErrorLoading(String message);
}
