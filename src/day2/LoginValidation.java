package day2;

public class LoginValidation {
    public static void main(String[] args){
        //입력과 정답
        String inputID = "admin";
        String inputPassword = "1234";

        String correctId = "admin";
        String correctPassword = "admin123";

        //방법 1 : 중첩 if (세부 오류 메시지)
        System.out.println("=== 방법 1 : 중첩 if ===");

        if (inputID.equals(correctId)){
            if(inputPassword.equals(correctPassword)){
                System.out.println("로그인 성공!");
                System.out.println("환영합니다. " + inputID + "님");
            }else {
                System.out.println("X 비밀번호가 틀렸습니다.");
                System.out.println("비밀번호를 확인해 주세요.");
            }
        } else {
            System.out.println("X 존재하지 않는 아이디입니다.");
            System.out.println("아이디를 확인해 주세요");
        }



        // 방법2 : 논리 연산자 (간단 검증)
        System.out.println("\n ====방법2 : 논리연산자 ====");

        if ( inputID.equals(correctId) && inputPassword.equals(correctPassword)){
            System.out.println("로그인 성공");
        }else {
            System.out.println("로그인 실패");
        }


        //방법3 : 로그인 시도 횟수 제한
        System.out.println("\n===추가 : 로그인 시도 횟수 ===");

        int attempts = 3;
        if (attempts >= 5) {
            System.out.println("계정이 잠겼습니다. 관리자에게 문의하세요.");
        } else if (attempts >= 3){
            System.out.println("로그인 시도 " + attempts + " 회 실패.");
            System.out.println("2회 더 실패하면 계정이 잠깁니다.");
        }else {
            System.out.println("로그인 시도 " + attempts + "회 실패");
        }


    }



}
