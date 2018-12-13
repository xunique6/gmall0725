package com.atguigu.gmall.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SpuSaleAttr implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id ;
    Integer spuId;
    Integer saleAttrId;
    String saleAttrName;
    @Transient
    List<SpuSaleAttrValue> spuSaleAttrValueList;
    @Transient
    Map spuSaleAttrValueJson;
}
