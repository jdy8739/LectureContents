public class BitOrTest {
    public static void main(String[] args) {
        int num1 = 10, num2 = 5;


        // | 이 비트 연산자 OR
        // 관계 연산자에서는 || 형태로 존재했음
        // 10 ===> 1010
        // 5 ===>  0101 OR
        // ----------------
        // 15 ===> 1111


        System.out.printf("%d OR %d = %d\n ",num1,num2,num1 | num2);

        num2 = 136;

        // 10 ===>   00001010
        // 136 ===>  10001000 OR
        // ----------------
        // 138 ===> 10001010

        System.out.printf("%d OR %d = %d\n ",num1,num2,num1 | num2);

        //*************** OR 연산은 합집합 개념, AND 연산은 교집합 개념 ****************
        //                이거 보고 무슨느낌인지 팍 와닿았음 이런개념으로 생각하기
    }
}
