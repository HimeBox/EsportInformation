package com.example.esportinformation;

import android.content.Context;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.io.Serializable;

public class MatchStorage implements Serializable{

    public MatchStorage(List<Match> matchList, List<Integer> idList, Context context) {
        this.matchList = matchList;
        this.idList = idList;
        this.context = context;
    }

    private List<Match> matchList;
    private List<Integer> idList;
    private Context context;
    private String fileName = "schedule_list.txt";

    public List<Match> getMatchList() {
        return matchList;
    }

    public void setMatchList(List<Match> matchList) {
        this.matchList = matchList;
    }

    public List<Integer> getIdList() {
        return idList;
    }

    public void setIdList(List<Integer> idList) {
        this.idList = idList;
    }

    public void save(){
        try {
            FileOutputStream fileOutputStream = context.openFileOutput(fileName, Context.MODE_PRIVATE);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(this);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read(){
        try {
            FileInputStream fileInputStream = context.openFileInput(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            MatchStorage temp = (MatchStorage) objectInputStream.readObject();
            this.matchList = temp.getMatchList();
            this.idList = temp.getIdList();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean addItem(Match match, Integer id){
        if(this.idList.indexOf(id) != -1){
            Toast.makeText(context,"Add failed! Match already exist!",Toast.LENGTH_LONG).show();
            return false;
        }
        this.matchList.add(match);
        this.idList.add(id);
        return true;
    }

    public void deleteItem(Integer pos){
        this.matchList.remove(pos);
        this.idList.remove(pos);
    }
}
