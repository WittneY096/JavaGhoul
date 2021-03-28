class JavaGhoul {
    public static void main(String args[]) throws InterruptedException {
        int i = 1000; 
        while(i >= 0) {
            System.out.println(i + " - 7 = " + (i-7));
            i -= 7; 
            Thread.sleep(200);
        }
    }
}