public class Exercise5 {
    public static void main(String[] argv){
        Call[] calls = new Call[8];
        calls[0] = new Call("111 111 111", "222 222 222", 30);
        calls[1] = new Call("111 111 111", "333 333 333", 60, 1);
        calls[2] = new Call("222 222 222", "333 333 333", 20, 2);
        calls[3] = new Call("111 111 111", "444 444 444", 120, 3);
        calls[4] = new Call("222 222 222", "555 555 555", 300);
        calls[5] = new Call("333 333 333", "444 444 444", 50);
        calls[6] = new Call("555 555 555", "111 111 111", 80, 2);
        calls[7] = new Call("444 444 444", "222 222 222", 450, 3);
        double cost = 0;

        for(int i = 0; i < calls.length; i++){
            calls[i].printData();
        }

        for(int i = 0; i < calls.length; i++){
            calls[i].printCall();
        }

        for(int i = 0; i < calls.length; i++){
            cost += calls[i].getCost();
        }
        System.out.println("Total calls: " + calls.length + " | Total turnover: " + cost);
    }
}