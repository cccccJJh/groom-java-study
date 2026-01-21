package day12.EncapsulationEx;

public class ProductValidation {

    private String name;
    private int price;
    private int stock;
    private String category;

    // ─────────────────────────────────────────────────────
    // 패턴 1: 범위 검사
    // ─────────────────────────────────────────────────────
    public void setPrice(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("가격은 0 이상이어야 합니다.");
        }
        if (price > 100000000) {
            throw new IllegalArgumentException("가격이 너무 높습니다.");
        }
        this.price = price;
    }

    // ─────────────────────────────────────────────────────
    // 패턴 2: 최솟값 보정
    // ─────────────────────────────────────────────────────
    public void setStock(int stock) {
        // 음수면 0으로 보정
        this.stock = Math.max(0, stock);
    }

    // ─────────────────────────────────────────────────────
    // 패턴 3: 허용 목록 검사
    // ─────────────────────────────────────────────────────
    public void setCategory(String category) {
        String[] validCategories = {"전자제품", "의류", "식품", "도서"};

        for (String valid : validCategories) {
            if (valid.equals(category)) {
                this.category = category;
                return;
            }
        }
        System.out.println("⚠️ 유효하지 않은 카테고리입니다.");
    }

    // ─────────────────────────────────────────────────────
    // 패턴 4: 문자열 정규화 (앞뒤 공백 제거)
    // ─────────────────────────────────────────────────────
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("⚠️ 상품명을 입력해주세요.");
            return;
        }
        this.name = name.trim();  // 공백 제거 후 저장
    }


}
