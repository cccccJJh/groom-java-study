package day12;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();

        // p.name = "홍길동";      // ❌ 컴파일 에러! private 접근 불가
        // p.age = 25;           // ❌ 컴파일 에러!
        // p.isValidAge(25);     // ❌ 컴파일 에러!

        p.setAge(25);            // ✅ public 메서드로 접근
    }
}
