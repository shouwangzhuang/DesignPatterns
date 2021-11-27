/**
 * @ClassName PythonCourse
 * @Description
 * @Author zsw
 * @Date 2021/11/28-0:05
 */
package com.learn.pattern.factory.simpleFactory;

public class PythonCourse implements ICourse{

    @Override
    public void record() {
        System.out.println("录制python课程");
    }
}
