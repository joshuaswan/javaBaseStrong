package com.joshua.base.annotation;


import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by joshua on 2017/7/19.
 */

@RunWith(Parameterized.class)
public class FileReaderTest {

    @Parameterized.Parameters
    public static String[] data(){
        return new String[]{"C:\\workspace\\javaBaseStronger\\src\\main\\resources\\readFile.txt",
                "C:\\workspace\\javaBaseStronger\\src\\main\\resources\\readFile1.txt"};
    }

    @Ignore
    public void getPath() throws Exception {
        FileReader fileReader = new FileReader("C:\\workspace\\javaBaseStronger\\src\\main\\resources\\readFile.txt");
        fileReader.getPath();
    }

    @Test(timeout = 50)
    public void getContext() throws Exception {
        FileReader fileReader = new FileReader("C:\\workspace\\javaBaseStronger\\src\\main\\resources\\readFile.txt");
        assertThat("This is file is to test the junit4 andfile read.",is(fileReader.getContext()));
        fileReader.getContext();
    }

    @Test(
//            expected = IOException.class
//            该注解表示该测试方法需要抛出对应异常信息
    )
    public void getFileLength() throws Exception {
        FileReader fileReader = new FileReader("C:\\workspace\\javaBaseStronger\\src\\main\\resources\\readFile.txt");
        assertThat(50L,is(fileReader.getFileLength()));
    }

}
