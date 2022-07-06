package com.design.pattern.bridge;

/**
 * @author Huws
 * @version v1.0
 * @ClassName Mac
 * @Description
 * @date 2022/6/6 11:54
 **/
public class Mac extends OpratingSystem {

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
