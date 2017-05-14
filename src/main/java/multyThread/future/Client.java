package multyThread.future;


/**
 * Created by Administrator on 2017/5/14.
 */
public class Client {
    public Data request() {
        final FutureData future = new FutureData();
        new Thread(
                () -> {
                    RealData realData = new RealData();
                    future.setRealData(realData);
                }
        ).start();
        return future;
    }
}
