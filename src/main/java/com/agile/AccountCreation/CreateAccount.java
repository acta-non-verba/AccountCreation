
package com.agile.AccountCreation;

public class CreateAccount {

    public String accountCreation(String userName, String password) {
        String message = "";
        
        message = validateUsername(userName);
        if (message.equals(""))
            message = validatePassword(password);

        if (message.equals(""))
            message = "Account created successfully.";
        return message;
    }

    private String validatePassword(String password) {

        if (password.equals("")) {
            return "Account Creation Failed.";
        }
        if (!password.matches("^[0-9]+$")) {
            return "Account creation failed because password contains non numeric characters.";
        }
        return "";
    }

    private String validateUsername(String userName) {
        if (userName.equals("")) {
            return "Account Creation Failed, Username cannot be empty.";
        }
        if (!userName.matches("[a-zA-Z]+")) {
            return "Account creation failed, username should have all alphabets.";
        }
        if (userName.length() > 11) {
            return "Account creation failed because username contains more than 11 characters.";
        }
        if (userName.length() < 2) {
            return "Account creation failed because username contains less than 2 characters.";
        }
        return "";
    }

}
