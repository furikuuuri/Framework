package service;
import model.User;
public class UserCreator {
    public static final String MAIL="testdata.user.mail";
    public static final String PASSWORD="testdata.user.password";

    public static  User withCredentialsFromProperty(){
        return new User(TestDataReader.getTestData(MAIL),TestDataReader.getTestData(PASSWORD));
    }
}
