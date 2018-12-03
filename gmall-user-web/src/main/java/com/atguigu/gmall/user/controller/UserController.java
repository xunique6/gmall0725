package com.atguigu.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    //@Autowired
    @Reference
    private UserService userService;

    @RequestMapping("/getUserInfoList")
    public List<UserInfo> userInfoList(){
        System.out.println("获取所有userInfo成功！");
        return userService.userInfoList();
    }
    @RequestMapping("/addUserInfo")
    public  void   addUserInfo(UserInfo userInfo){
        userService.saveUserInfo(userInfo);
        System.out.println("添加UserInfo成功！");
    }
    @RequestMapping("/updateUserIfo")
    public  void  updateUserInfo(UserInfo userInfo){
        userService.updateUserInfoByUserInfo(userInfo);
        System.out.println("更新UserInfo成功！");
    }
    @RequestMapping("/removeUserIfo/{id}")
    public void  removeUserInfo(@PathVariable("id") Integer id ){
        userService.deleteUserInfoById(id);
        System.out.println("删除UserInfo成功！");
    }
    @RequestMapping("/getUserInfoById/{id}")
    public UserInfo  getUserInfo(@PathVariable("id")Integer id){
        return userService.getUserInfoById(id);
    }
    @RequestMapping("/getUserAddressList")
    public List<UserAddress>  getUserAddressList(){
        return userService.userAddressList();
    }
    @RequestMapping("/getUserAddressById/{id}")
    public UserAddress getUserAddressById(@PathVariable("id") Integer id){
        return  userService.getUserAddressById(id);
    }
    @RequestMapping("/saveUserAddress")
    public void saveUserAddress(UserAddress userAddress){
        userService.saveUserAddress(userAddress);
    }

    @RequestMapping("/updateUserAddressById")
    public  void updateUserAddressById(UserAddress userAddress){
        userService.updateUserAddressByUserAddress(userAddress);
    }

    @RequestMapping("/removeUserAddressById/{id}")
    public void removeUserAddressById(@PathVariable("id")Integer id){
        userService.deleteUserAddressById(id);
    }
}
