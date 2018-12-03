package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.UserInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserService {

    List<UserInfo> userInfoList();

    void saveUserInfo(UserInfo userInfo);

    Integer  deleteUserInfoById(Integer id);

    Integer  updateUserInfoByUserInfo(UserInfo userInfo);

    UserInfo getUserInfoById(Integer id);

    List<UserAddress> userAddressList();

    Integer saveUserAddress(UserAddress userAddress);

    Integer  deleteUserAddressById(Integer id);

    Integer  updateUserAddressByUserAddress(UserAddress userAddress);

    UserAddress getUserAddressById(Integer id);
}
