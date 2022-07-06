package com.design.pattern.bridge;

/**
 * @author Huws
 * @version v1.0
 * @ClassName OpratingSystem
 * @Description 操作系统（抽象化角色）
 * @date 2022/6/6 11:48
 **/
public abstract class OpratingSystem {
    protected VideoFile videoFile;

    public OpratingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
