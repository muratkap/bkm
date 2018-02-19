package com.example.murti.proje;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by murti on 02/19/2018.
 */

public class UserRecyclerAdapter extends RecyclerView.Adapter<UserViewHolder> {

    private List<UserModel> users;
    private ItemClickEvent clickEvent;


    public UserRecyclerAdapter(List<UserModel> users, ItemClickEvent clickEvent) {
        this.users = users;
        this.clickEvent = clickEvent;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_user_item, parent, false);
        return new UserViewHolder(view, clickEvent);

    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        holder.setItem(users.get(position));
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
