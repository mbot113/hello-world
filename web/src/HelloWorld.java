public class HelloWorld {

    private int myNumber;

    public void setMyNumber(int a) {
        System.out.println("I will change the value of myNumber");
        myNumber = a;
    }

    public int getMyNumber() {
        return myNumber;
    }

    public void print() {
        System.out.println("Hello, World");
    }

    public static void main(String[] args) {
        HelloWorld test = new HelloWorld();
        test.print();
        System.out.println("My number is " + test.getMyNumber());
        test.setMyNumber(15);
        System.out.println("My number is " + test.getMyNumber());

    }

}