public class App {
    public static int recursive1(int n) {
        if(n <= 0) {
            return 2;
        } else {
            return 2 + recursive1(n - 2);
        }
    }

    public static int recursive2(int n) {
        if(n == 2 || n == 1) {
            return 2 * n;
        } else {
            return recursive2(n - 1) - recursive2(n - 2);
        }
    }

    public static void main(String[] args) throws Exception {
        int n = 6;
        System.out.println(recursive1(n));
        System.out.println(recursive2(n));
    }
}

//  foo(5)
//      foo(4)
//          foo(3)
//              foo(2) base = return 4
//          return 8
//      return 16
//  return 32

//  foo(4)
//      foo(2) base = return 4
//  return 8

//  foo(6)
//      foo(5) - foo(4)
//          (foo(4) - foo(3)) - (foo(3) - foo(2))
//              (foo(3) - foo(2)) - (foo(2) - foo(1)) - (foo(2) - foo(1)) - BASE
//                  (foo(2) - foo(1)) - BASE - BASE - BASE - BASE - BASE - BASE