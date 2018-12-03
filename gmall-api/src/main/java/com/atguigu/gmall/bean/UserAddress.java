package com.atguigu.gmall.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class UserAddress implements Serializable{
    @Id
    private Integer id;
    private String userAddress;
    private Integer userId;
    private String consignee;
    private String phoneNum;
    private String isDefault;

}
