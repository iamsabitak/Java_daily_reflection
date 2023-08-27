package collection;

public class Date {
    public static void main(String[] args) {
        System.out.println("Number of millisecond since 1970 " + System.currentTimeMillis());
        System.out.println("Number of second since 1970 " + System.currentTimeMillis()/1000);
        System.out.println("Number of hours since 1970 " + System.currentTimeMillis()/1000/3600);
        System.out.println("Number of Days since 1970 " + System.currentTimeMillis()/1000/3600/24);
        System.out.println("Number of years since 1970 " + System.currentTimeMillis()/1000/3600/24/365);
        
    }
}
