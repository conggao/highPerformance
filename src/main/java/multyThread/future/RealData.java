package multyThread.future;

/**
 * Created by Administrator on 2017/5/14.
 */
public class RealData implements Data {
    protected final String result;

    public RealData() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            sb.append(i);

        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        result = sb.toString();
    }

    public String getResult() {
        return result;
    }
}
