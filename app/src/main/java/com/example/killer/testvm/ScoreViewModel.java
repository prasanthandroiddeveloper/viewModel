package com.example.killer.testvm;

import android.arch.lifecycle.ViewModel;

public class ScoreViewModel extends ViewModel{



    private static Integer data;

    public static Integer getdata(){

        if(data==null){
            data=0;
        }
        return data;

    }

    public void adddata(){
        if(data==null){
            data=0;
        }
        data+=1;

    }

    public void removedata(){
        if(data==null){
            data=0;
        }
        data-=1;
    }




}
