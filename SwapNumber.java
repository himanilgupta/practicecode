class SwapNumber {
    void withThirdVar(int a, int b){
        int temp = b;
        b = a;
        a = temp;
        System.out.println("Value of a: "+a+" and value of b: "+b);
    }
    void withoutThirdVar(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Value of a: "+a+" and value of b: "+b);
    }
    public static void main(String args[]) {
        SwapNumber num = new SwapNumber();
        num.withThirdVar(9, 2);
        num.withoutThirdVar(12, 10);
    }
}