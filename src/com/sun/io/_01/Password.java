package com.sun.io._01;

import java.io.Console;
import java.util.Arrays;

/**
 * Created by sunleic on 2017/9/20.
 * Version by ${VERSION}
 */
public class Password {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.err.println(" No Console ");
            System.exit(-1);
        }

        String login = console.readLine("Enter you login:");
        char[] oldPassword = console.readPassword("Enter your old password:");

        if (verify(login, oldPassword)) {
            boolean noMatch;
            do {
                char[] newPassword1 = console.readPassword("Enter your new password: ");
                char[] newPassword2 = console.readPassword("Enter new password again: ");
                noMatch = Arrays.equals(newPassword1, newPassword2);
                if (noMatch) {
                    console.format("Passwords don't match. Try again.%n");
                } else {
                    change(login, newPassword1);
                    console.format("Password for %s changed.%n", login);
                }
                Arrays.fill(newPassword1, ' ');
                Arrays.fill(newPassword2, ' ');
            } while (noMatch);
        }
        Arrays.fill(oldPassword, ' ');
    }

    static boolean verify(String login, char[] password) {
        // This method always returns
        // true in this example.
        // Modify this method to verify
        // password according to your rules.
        return true;
    }

    // Dummy change method.
    static void change(String login, char[] password) {
        // Modify this method to change
        // password according to your rules.
    }
}
