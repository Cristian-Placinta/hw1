class TestingDoWhile {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        do {
            sum += n;
        }while(n-- > 0); 
        System.out.println(sum);
    }
}