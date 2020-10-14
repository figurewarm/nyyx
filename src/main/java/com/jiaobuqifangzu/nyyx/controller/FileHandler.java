package com.jiaobuqifangzu.nyyx.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author ChenXing
 * @date 2020/10/14 20:37
 */
@Controller
@RequestMapping("/file")
public class FileHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(FileHandler.class);

    @GetMapping("/upload")
    public String upload() {
        return "upload";
    }

    @PostMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file) throws FileNotFoundException {
        if (file.isEmpty()) {
            return "上传失败，请选择文件";
        }

        String upFile = file.getOriginalFilename();
        //用时间戳代替文件名
        Date data = new Date();
        String fileType = "";
        System.out.println(upFile);
        if (upFile != null)
            fileType += upFile.split("\\.")[upFile.split("\\.").length-1];

        System.out.println(fileType);
        String fileName = data.getTime() + "." + fileType;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        String filepath = dateFormat.format(data);
        String creatpath = ResourceUtils.getURL("classpath:").getPath() + "static/" + filepath + "/";

        //用于查看路径是否正确
        System.out.println(creatpath);

        File file1 = new File(creatpath);
        if (!file1.exists())
            file1.mkdirs();
        File dest = new File(creatpath + fileName);
        try {
            file.transferTo(dest);
            LOGGER.info("上传成功");
            return creatpath + fileName;
        } catch (IOException e) {
            LOGGER.error(e.toString(), e);
        }
        return "上传失败！";
    }

}



