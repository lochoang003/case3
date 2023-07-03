package com.example.case3;

import com.example.case3.dao.Users_DAO;
import com.example.case3.model.Users;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Users_DAO ud=new Users_DAO();
        ArrayList<Users> list= (ArrayList<Users>) ud.getAll_users();
    }
}
