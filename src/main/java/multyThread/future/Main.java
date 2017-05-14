package multyThread.future;

/**
 * Created by Administrator on 2017/5/14.
 */
public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        Data data = client.request();
        System.out.println("request ok");
        long startTime = System.currentTimeMillis();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Êý¾Ý:"+data.getResult());
        System.out.println(System.currentTimeMillis() - startTime);


    }


}
