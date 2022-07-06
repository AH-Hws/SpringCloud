package com.design.pattern.bridge;

/**
 * @author Huws
 * @version v1.0
 * @ClassName AviFile
 * @Description avi文件（具体实现化角色）
 * @date 2022/6/6 11:47
 **/
public class AviFile implements VideoFile {

    public void decode(String fileName) {
        System.out.println("avi视频文件：" + fileName);
    }
}
