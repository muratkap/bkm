package com.example.murti.proje;

/**
 * Created by murti on 02/19/2018.
 */
import android.os.Parcel;
import android.os.Parcelable;


public class UserModel implements Parcelable {
    private String id;
    private String name;
    private String mail;
    private String phone;


    public UserModel(String id, String name, String mail, String phone) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeString(this.mail);
        dest.writeString(this.phone);
    }

    protected UserModel(Parcel in) {
        this.id = in.readString();
        this.name = in.readString();
        this.mail = in.readString();
        this.phone = in.readString();
    }

    public static final Parcelable.Creator<UserModel> CREATOR = new Parcelable.Creator<UserModel>() {
        @Override
        public UserModel createFromParcel(Parcel source) {
            return new UserModel(source);
        }

        @Override
        public UserModel[] newArray(int size) {
            return new UserModel[size];
        }
    };
}