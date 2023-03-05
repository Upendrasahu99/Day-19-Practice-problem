package com.bridgelabz.user_regstration_problem;

import java.util.Scanner;

public class UserRegistration {

    String firstName;

    UserRegistration(int user){
        System.out.println("User " + user);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user first name : ");
        this.firstName = scanner.nextLine();
    }
   public boolean validationOfFirstName(){
        if(firstName.matches("[A-Z][a-z]{2,}")){
            return true;
        }else{
            System.out.println("Invalid data");
         return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");

        UserRegistration user1 = new UserRegistration(1);
        user1.validationOfFirstName();
    }
}
