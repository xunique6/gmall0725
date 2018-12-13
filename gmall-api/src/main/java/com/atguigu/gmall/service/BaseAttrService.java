package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.BaseAttrInfo;

import java.util.List;
import java.util.Set;

public interface BaseAttrService {
    List<BaseAttrInfo> getAttrList(Integer cagalog3Id);

    void saveAttr(BaseAttrInfo baseAttrInfo);


    List<BaseAttrInfo> attrInfoList(Integer catalog3Id);

    List<BaseAttrInfo> getAttrListByValueIds(Set<Integer> valueIds);
}
