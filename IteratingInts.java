class IteratingInts {
    public static void main(String[] args) {
        int n = 7;

        for(int i=0; i<n; i++) {
            for(int j=0; j<i+1; j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}