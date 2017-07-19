package com.joshua.base.annotation;

/**
 * Created by joshua on 2017/7/18.
 */

@MyAnnotation
//这里是将新创建好的注解类MyAnnotation标记到Annotation类上
public class AnnotationUse {

    public static void main(String... args){
        //这里检查Annotation类是否有注解，这里需要使用反射才能完成对Annotation类的检查
        if (AnnotationUse.class.isAnnotationPresent(MyAnnotation.class)) {
            /**
             * MyAnnotation是一个类，这个类的实例对象annotation是通过反射得到的，
             * 一旦在某个类上使用了@MyAnnotation，那么这个MyAnnotation类的实例对象annotation就会被创建出来了。
             */
            MyAnnotation annotation = (MyAnnotation) AnnotationUse.class.
                    getAnnotation(MyAnnotation.class);

            System.out.println(annotation);
        }
    }
}
