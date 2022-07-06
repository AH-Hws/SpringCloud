package com.design.pattern.bridge;

/**
 * @author Huws
 * @version v1.0
 * @ClassName VideoFile
 * @Description 视频文件（实现化角色）
 * @date 2022/6/6 11:46
 **/
public interface VideoFile {
    /**
     * 解码功能
     * @param fileName
     */
    void decode(String fileName);
}
