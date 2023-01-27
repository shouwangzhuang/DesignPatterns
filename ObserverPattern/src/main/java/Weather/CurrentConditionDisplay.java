package Weather;

/**
 * @author shou.wangzhuang
 * @date 2023/1/27 16:44
 */
public class CurrentConditionDisplay implements Observer, DisplayElement{
    private float temp;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        /**
         * 注册主题
         */
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("current conditions:" + temp + "F degrees and" +
                humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }
}
