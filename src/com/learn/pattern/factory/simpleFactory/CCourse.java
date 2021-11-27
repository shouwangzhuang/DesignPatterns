/**
 * @ClassName CCourse
 * @Description
 * @Author zsw
 * @Date 2021/11/28-0:06
 */
package com.learn.pattern.factory.simpleFactory;

public class CCourse implements ICourse{
    @Override
    public void record() {
        System.out.println("录制C课程");
    }
}
