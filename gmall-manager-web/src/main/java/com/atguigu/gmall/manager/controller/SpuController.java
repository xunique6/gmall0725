package com.atguigu.gmall.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.BaseSaleAttr;
import com.atguigu.gmall.bean.SpuInfo;
import com.atguigu.gmall.manager.util.GmallUploadUtils;
import com.atguigu.gmall.service.SpuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
public class SpuController {

    @Reference
    private SpuService spuService;

    @RequestMapping("/spuListPage")
    public String  spuListPage(){
        return "spuListPage";
    }

    @ResponseBody
    @RequestMapping("/getSpuList")
    public List<SpuInfo>  getSpuList(Integer catalog3Id){

        List<SpuInfo> SpuInfos = spuService.getSpuList(catalog3Id);

        return SpuInfos;
    }


    @ResponseBody
    @RequestMapping("/baseSaleAttrList")
    public List<BaseSaleAttr>  baseSaleAttrList(){

        List<BaseSaleAttr> baseSaleAttrs= spuService.baseSaleAttrList();

        return baseSaleAttrs;
    }


    @ResponseBody
    @RequestMapping("/saveSpu")
    public String saveSpu(SpuInfo SpuInfo){

        spuService.saveSpu(SpuInfo);

        return "success";
    }

    @ResponseBody
    @RequestMapping("/fileUpload")
    public  String  fileUpload(@RequestParam("file") MultipartFile multipartFile){
        String imageUrl = GmallUploadUtils.upload(multipartFile);
        return imageUrl;
    }


}
