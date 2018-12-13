package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.BaseSaleAttr;
import com.atguigu.gmall.bean.SpuImage;
import com.atguigu.gmall.bean.SpuInfo;
import com.atguigu.gmall.bean.SpuSaleAttr;

import java.util.List;

public interface SpuService {

    List<SpuInfo> getSpuList(Integer catalog3Id);

    List<BaseSaleAttr> baseSaleAttrList();

    void saveSpu(SpuInfo spuInfo);

    List<SpuSaleAttr> spuSaleAttrList(Integer spuId);

    List<SpuImage> spuImageList(Integer spuId);

    List<SpuSaleAttr> spuSaleAttrListBySpuId(Integer spuId, Integer skuId);
}
