package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] students={"christian","Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name student:");
        String input_name =  scanner.nextLine();
        boolean isExist = false;
        for(int i=0;i< students.length;i++){
            if(students[i].equals(input_name)){
                System.out.println("position of the students in the list"+input_name+"is: "+i );
                isExist = true;
                break;
            }
        }
        if(!isExist){
            System.out.println("not found" + input_name + "in the list.");
        }
    }
}
