/**
 * @ClassName JavaCourse
 * @Description
 * @Author zsw
 * @Date 2021/11/28-0:04
 */
package com.learn.pattern.factory.simpleFactory;

public class JavaCourse implements ICourse{
    @Override
    public void record() {
        System.out.println("录制java课程");
    }
}
