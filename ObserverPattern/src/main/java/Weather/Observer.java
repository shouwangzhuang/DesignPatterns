package Weather;

/**
 * @author shou.wangzhuang
 * @date 2023/1/27 16:15
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
