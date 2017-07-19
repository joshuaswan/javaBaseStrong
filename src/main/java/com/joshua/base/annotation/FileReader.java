package com.joshua.base.annotation;

import java.io.*;

/**
 * Created by joshua on 2017/7/19.
 */
public class FileReader {
    private String path= "";
    private String context="";
    private long fileLength ;

    public FileReader(String path) {
        this.path = path;
    }

    public String getContext() throws IOException{
        this.context = "";
        File file = new File(this.path);

        FileInputStream inputStream = new FileInputStream(file);
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);
        StringBuffer buffer = new StringBuffer();
        String temp = null;
        while ((temp=bufferedReader.readLine())!=null){
            this.context+=temp;
//            buffer.append(temp);
        }
//        this.context = buffer.toString();
        return this.context;
    }

    public long getFileLength() {
        File file = new File(this.path);
        this.fileLength = file.length();

        return this.fileLength;
    }

    public String getPath() {
        return path;
    }
}
