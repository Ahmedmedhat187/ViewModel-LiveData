package com.ahmed.viewmodellivedata;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class ScoreViewModel extends ViewModel {

    private MutableLiveData<Integer> score;


    public MutableLiveData<Integer> getScore() {
        if(score == null){
            score = new MutableLiveData<>();
            score.setValue(0);
        }
        return score;
    }

    public void addScore(){
        if(score.getValue() != null){
            score.setValue(score.getValue() + 1);
        }
    }

    public void resetScore(){
        score.setValue(0);
    }
}
