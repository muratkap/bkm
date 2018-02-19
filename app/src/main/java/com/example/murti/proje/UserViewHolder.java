package com.example.murti.proje;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by murti on 02/19/2018.
 */

public class UserViewHolder extends RecyclerView.ViewHolder {

    private ItemClickEvent clickEvent;
    private final CardView rootCard;
    private final TextView tvName;

    public UserViewHolder(View view, ItemClickEvent clickEvent) {
        super(view);
        this.clickEvent = clickEvent;
        rootCard = view.findViewById(R.id.user_item_card);
        tvName = view.findViewById(R.id.user_item_tv);

    }

    public void setItem(UserModel user) {
        tvName.setText(user.getName());
        rootCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickEvent.onItemClicked(getLayoutPosition());
            }
        });
    }
}
