package com.example.murti.proje;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;



import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String SELECTED_USER = "selectedUser";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final List<UserModel> users = getMockUsers();
        RecyclerView userRecycler = findViewById(R.id.user_recycler_view);
        LinearLayoutManager lm = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        UserRecyclerAdapter userAdapter = new UserRecyclerAdapter(users, new ItemClickEvent() {
            @Override
            public void onItemClicked(int position) {

                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra(SELECTED_USER, users.get(position));
                startActivity(intent);
            }
        });
        userRecycler.setLayoutManager(lm);
        userRecycler.setAdapter(userAdapter);
    }

    private List<UserModel> getMockUsers() {
        List<UserModel> users = new ArrayList<>();
        users.add(new UserModel("1", "Murat Kap", "muratkap@gmail.com", "+905000000000"));
        users.add(new UserModel("2", "Mert Demir", "mertdemir@gmail.com", "+905389546606"));
        users.add(new UserModel("3", "Kadir Culcu", "pikacu@gmail.com", "+905111111111"));
        return users;
    }
}
