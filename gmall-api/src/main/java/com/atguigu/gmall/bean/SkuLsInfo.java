package com.atguigu.gmall.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SkuLsInfo implements Serializable{
    Integer id;
    BigDecimal price;
    String skuName;
    String skuDesc;
    String catalog3Id;
    String skuDefaultImg;
    Long hotScore;
    List<SkuLsAttrValue> skuAttrValueList;
}
