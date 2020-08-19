package com.mitm.junoon.Extra;

import androidx.annotation.Keep;

@SuppressWarnings("WeakerAccess")

@Keep
public class student {

    public String fullName,Username,Email,Gender;

    public student(){


    }
    public student(String fullName,String username,String email,String gender) {
        this.fullName = fullName;
         Username = username;
         Email = email;
         Gender = gender;
    }
}

