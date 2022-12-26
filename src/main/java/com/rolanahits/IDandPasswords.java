package com.rolanahits;

import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<>();
    IDandPasswords() {
        logininfo.put("user1@gmail.com", "pass1");
        logininfo.put("user2@yahoo.com", "pass2");
        logininfo.put("user3@hotmail.com", "pass3");
    }

    protected HashMap getLoginInfo() {
        return logininfo;
    }
}
