class TestingSwitch {
    public static void main(String[] args) {
        char c = 'a';

        switch(c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vocala");
                break;
            default: 
                System.out.println("consoana");
        }
    }
}