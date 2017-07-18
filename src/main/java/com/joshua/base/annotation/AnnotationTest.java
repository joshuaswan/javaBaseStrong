package com.joshua.base.annotation;

/**
 * Created by joshua on 2017/7/18.
 * 此类是用来演示注释（Annotation）的应用的，注释也是JDK1.5新增加的特定之一
 * JDK1.5内部提供的三种注释是：@SuppressWarnings(":deprecation")、@Deprecated、@Override
 */
public class AnnotationTest {

    /**
     * 这里的注释为压缩警告，这是JDK内部自带的一个注释，一个注释就是一个类，这里使用这个注释就是创建了SuppressWarning类的一个实例对象
     */
    @SuppressWarnings(":deprecation")
    public static void main(String... args){
        System.runFinalizersOnExit(true);
    }

    //这也是JDK内部自带的一个注释，意思就是说这个方法已经废弃了，不建议使用
    @Deprecated
    public static void sayHello(){
        System.out.println("hi, joshua");
    }

    @Override
    public String toString() {
        return "joshua Annotation class";
    }
}
