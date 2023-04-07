class TestingWhile {
    public static void main(String[] args) {
        int n = 4;
        int sum = 0;
        while(n-- > 0) {
            sum += n+1;
        }
        System.out.println(sum);
    }
}