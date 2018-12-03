package com.atguigu.gmall.bean;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo implements Serializable{
    @Id
    @Column
    private  Integer  id;
    private  String   loginName;
    private  String   nickName;
    private  String   passwd;
    private  String   name;
    private  String   phoneNum;
    private  String   email;
    private  String   headImg;
    private  String   userLevel;
    private List<UserAddress> userAddressList;

    public  UserInfo(Integer id ){

    }
}
