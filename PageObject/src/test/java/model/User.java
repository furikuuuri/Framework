package model;

public class User {
    private String eMail;
    private String password;
    public User(String email,String pass)
    {
        eMail=email;
        password=pass;
    }
    public String GetMail(){
        return eMail;
    }
    public String GetPassword(){
        return password;
    }
}
