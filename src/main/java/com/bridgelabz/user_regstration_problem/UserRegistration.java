package com.bridgelabz.user_regstration_problem;

import java.util.Scanner;

public class UserRegistration {

    String firstName;
    String lastName;

    UserRegistration(int user) {
        System.out.println("User " + user);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user first name : ");
        this.firstName = scanner.nextLine();
        System.out.print("Enter user last name : ");
        this.lastName = scanner.nextLine();
    }

    public void validationOfFirstName() {
        if (firstName.matches("[A-Z][a-z]{2,}")) {

        } else {
            System.out.println("Invalid data");

        }
    }

    public void validationOfLastName() {

        if (lastName.matches("[A-Z][a-z]{2,}")) {

        } else {
            System.out.println("Invalid data");

        }
    }


    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");

        UserRegistration user1 = new UserRegistration(1);
        user1.validationOfFirstName();
    }
}
