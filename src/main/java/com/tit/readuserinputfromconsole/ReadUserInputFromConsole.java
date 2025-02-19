package com.tit.readuserinputfromconsole;

public class ReadUserInputFromConsole {
    public static void main(String[] args)
    {
        // Creating an object of UserInfo
        UserInfo userInfo = new UserInfo();

        // File name to save the user information
        String fileName = "src/main/resources/user_info.txt";

        // Read and save user information
        userInfo.readAndSaveUserInfo(fileName);
    }

}
