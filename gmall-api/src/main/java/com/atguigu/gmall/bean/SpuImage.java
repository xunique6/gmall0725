package com.atguigu.gmall.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.Id;
import java.io.Serializable;
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SpuImage implements Serializable {

    @Id
    private Integer id;
    private Integer spuId;
    private String imgName;
    private String imgUrl;
}
