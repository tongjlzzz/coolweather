package util;

/**
 * Created by Administrator on 2016/7/16.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
