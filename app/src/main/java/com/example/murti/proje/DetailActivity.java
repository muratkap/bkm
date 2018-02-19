package com.example.murti.proje;

/**
 * Created by murti on 02/19/2018.
 */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        UserModel selectedUser = getIntent().getParcelableExtra(MainActivity.SELECTED_USER);

        TextView tvName = findViewById(R.id.tv_user_name);
        TextView tvMail = findViewById(R.id.tv_user_mail);
        TextView tvPhone = findViewById(R.id.tv_user_phone);

        tvName.setText(selectedUser.getName());
        tvMail.setText(selectedUser.getMail());
        tvPhone.setText(selectedUser.getPhone());
    }
}