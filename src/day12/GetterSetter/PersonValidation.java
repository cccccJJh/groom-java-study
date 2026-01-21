package day12.EncapsulationEx;

public class PersonValidation {
    private String name;
    private int age;
    private String email;
    private String phone;

    //이름 검증 :  null 또는 빈 문자열 방지
    public void setName(String name){
        if (name == null || name.trim().isEmpty()){
            System.out.println("이름을 입력해 주세요.");
            return;
        }
        this.name = name;
    }

    public String getName(){
        return name;
    }

    //나이 검증 : 범위 체크
    public void setAge(int age){
        if (age < 0){
            System.out.println("나이는 0 이상이어야 합니다.");
            return;
        }
        if (age > 150){
            System.out.println("나이는 150 이하여야 합니다.");
            return;
        }
        this.age = age;
    }


    //eamil 검증 : 형식 체크
    public void setEmail(String email){
        if (email == null || !email.contains("@")){
            System.out.println("올바른 이메일 형식이 아닙니다.");
            return;
        }
        this.email = email;
    }

    public void setPhone(String phone){
        if( phone == null) {
            System.out.println( "전화번호를 입력해 주세요" );
            return;
        }

        if(!phone.matches("[0-9-]+")){
            System.out.println("전화번호는 숫자와 하이픈만 입력 가능합니다.");
            return;
        }
        this.phone = phone;
    }

    static void main(String[] args) {
        PersonValidation pv = new PersonValidation();

        //pv.setName("");
        pv.setName("호호호");
        String n = pv.getName();
        System.out.println(n);
    }


}
