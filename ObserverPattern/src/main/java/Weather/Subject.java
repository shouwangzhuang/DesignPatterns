package Weather;

/**
 * @author shou.wangzhuang
 * @date 2023/1/27 16:16
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
