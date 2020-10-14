package com.jiaobuqifangzu.nyyx.controller;

import com.jiaobuqifangzu.nyyx.dao.repository.VideoRepository;
import com.jiaobuqifangzu.nyyx.domain.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChenXing
 * @date 2020/10/12 14:05
 */
@RestController
@RequestMapping("/video")
public class VideoHandler {
    @Autowired
    VideoRepository videoRepository;


    /**
     * 上传视频
     * @param video
     * @return
     */
    @PostMapping("/add")
    public Video uploadVideo(@RequestBody Video video){
        return null;
    }
}
