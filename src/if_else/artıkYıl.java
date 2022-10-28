package if_else;

public class artıkYıl {
    public static void main(String[] args) {
        int year = 2000;

        String result = year%100==0 ? (year%400==0  ?  "leap" : "not leap") : (year%4==0 ? "leap": "not leap");
        System.out.println(result);

    }
}
