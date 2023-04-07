class UsingTernaryOperator {
    public static void main(String[] args) {
        double num = -1.83;
        String message;

        message = num >= 1000000 ? "Large" : num <= 0 ? "Small" : "";
        System.out.println(message);
    }
}