public class GuardedPattern {
    public static void main(String[] args) {
        Object a = "Hello";
        System.out.println(getData(a));
    }

    public static Object getData(Object o) {
        return switch (o) {
            case String s && !s.isEmpty() -> "Not Empty";
                case String s -> "Empty";
                default -> "Not a String";
        };
    }
}

