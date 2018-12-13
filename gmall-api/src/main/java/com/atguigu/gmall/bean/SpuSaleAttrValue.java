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


@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SpuSaleAttrValue implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id ;
    Integer spuId;
    Integer saleAttrId;
    String saleAttrValueName;
    @Transient
    String isChecked;
}
