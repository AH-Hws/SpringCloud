package com.design.pattern.bridge;

/**
 * @author Huws
 * @version v1.0
 * @ClassName Windows
 * @Description 扩展抽象化角色
 * @date 2022/6/6 11:53
 **/
public class Windows extends OpratingSystem {


    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
