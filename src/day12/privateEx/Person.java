package day12;

public class Person {

    // ═══════════════════════════════════════════════════════
    // private 필드 - 외부에서 직접 접근 불가
    // ═══════════════════════════════════════════════════════
    private String name;
    private int age;
    private String password;  // 민감한 정보

    // ═══════════════════════════════════════════════════════
    // private 메서드 - 클래스 내부에서만 사용하는 보조 메서드
    // ═══════════════════════════════════════════════════════
    private boolean isValidAge(int age) {
        return age >= 0 && age <= 150;
    }

    // public 메서드에서 private 멤버 사용
    public void setAge(int age) {
        if (isValidAge(age)) {  // private 메서드 호출
            this.age = age;     // private 필드 접근
        }
    }
}

