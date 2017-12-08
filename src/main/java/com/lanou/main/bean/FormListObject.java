package com.lanou.main.bean;

import java.util.ArrayList;

/**
 * Created by dllo on 17/12/6.
 */
public class FormListObject<T> {
    private ArrayList<T> list;

    public ArrayList<T> getList() {
        return list;
    }

    public void setList(ArrayList<T> list) {
        this.list = list;
    }
}
