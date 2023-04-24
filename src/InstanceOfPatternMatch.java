public class InstanceOfPatternMatch {
    public static void main(String[] args) {
        Object o = "Hello World!";

        if (o instanceof String str) {
            System.out.println(str.toUpperCase());
        }

        if (o instanceof String str && !str.isEmpty()) {
            System.out.println(str.toUpperCase());
        }

        Object ob1 = 123;

        if (!(ob1 instanceof String str)) {
            throw new RuntimeException("Please provide valid string");
        }

    }
}
