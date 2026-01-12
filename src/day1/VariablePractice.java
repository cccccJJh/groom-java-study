package day1;

import java.net.StandardSocketOptions;

public class VariablePractice {
    public static void main(String[] args){
        String name = "홍길동";
        int age = 25;
        double height = 175.5;
        boolean isStudent = false;
        char grade = 'A';

        System.out.println("===== 학생 정보 =========");
        System.out.print("===================");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("키 : " + height);
        System.out.println("학생 여부 : " + isStudent);
        System.out.println("학점 : " + grade);


        //값 변경
        age = 26;
        grade = 'B';

        System.out.println("\n=== 1년 후 ===");
        System.out.println("나이: " + age + "살");
        System.out.println("학점: " + grade);

    }
}
