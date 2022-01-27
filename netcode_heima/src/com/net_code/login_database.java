package com.net_code;

import java.util.ArrayList;
import java.util.List;

public class login_database {
    private  static List<login_User> users=new ArrayList<login_User>();
    static {
        users.add(new login_User("xiaoli","970128"));
        users.add(new login_User("lijiashun","970128"));
        users.add(new login_User("192346353","970128"));
        users.add(new login_User("lijiashun","281013"));
    }
    public static List<login_User> getusers(){
        return users;
    }
}
