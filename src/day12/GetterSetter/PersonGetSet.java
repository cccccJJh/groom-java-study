package day12.EncapsulationEx;

public class PersonGetSet {

    // 예시
    public class Person {
        private String name;
        private int age;
        private boolean married;  // boolean 타입

        // ─────────────────────────────────────────────────────
        // 일반 Getter
        // ─────────────────────────────────────────────────────
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        // ─────────────────────────────────────────────────────
        // boolean 타입 Getter → is로 시작 (관례)
        // ─────────────────────────────────────────────────────
        public boolean isMarried() {
            return married;
        }


    }
}
