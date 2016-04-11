public class AdvancedHelloWorld {

    static {
        message = "Hello World!";
    }

    private final static String message;    

    public AdvancedHelloWorld() {}

    public static void main(String[] args) {
        System.out.println(new AdvancedHelloWorld().getMessage());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("AdvancedHelloWorld [");
        if (getMessage() != null)
            builder.append("message=").append(getMessage());
        builder.append("]");
        return builder.toString();
    }

    private final String getMessage() {
        return message;
    }

}