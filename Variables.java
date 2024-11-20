public class Variables {
    /*variable types:
    1.local variable=>which is included  in main function
    2.instance variable=>which is included in class before main class and main function does not allow it
    3.static variable=>it is always in class, it is declared with static keyword*/

    int a=2;//instance variable
    static int b=10;// static variable
    public static void main(String[] args) {
        System.out.println(b);//we only use static and local variable in static method
        int a=10;
        System.out.println(a);
        int b=13;
        System.out.println(b);
        Variables obj1=new Variables();
         int sums=obj1.sum();
        System.out.println(sums+" ");
        multiply();

    }

    public int sum(){
        int c=45;
        return a+b+c;

    }
    public static void multiply(){
        System.out.println(b);
        int a=16;
        System.out.println(a);
    }
}