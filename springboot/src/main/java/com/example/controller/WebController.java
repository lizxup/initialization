package com.example.controller;


import com.example.common.Result;
import com.example.common.enums.RoleEnum;
import com.example.entity.Account;
import com.example.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebController {


    @Autowired
    private AdminService adminService;

    /**
     * 默认请求接口
     * @return
     */
    @GetMapping("/")
    public Result  hello(){
        return Result.success();
    }


    /**
     * 登录
     */
    @PostMapping("/login")
    public Result login(@RequestBody Account account) {
        Account loginAccount = null;
        if (RoleEnum.ADMIN.name().equals(account.getRole())) {
            loginAccount = adminService.login(account);
        }
        return Result.success(loginAccount);
    }

    /**
     * 注册
     * @param account
     * @return
     */
    @PostMapping("/register")
    public Result register(@RequestBody Account account) {
        return Result.success();
    }


    /**
     * 修改密码
     */
    @PutMapping("/updatePassword")
    public Result updatePassword(@RequestBody Account account) {
        if (RoleEnum.ADMIN.name().equals(account.getRole())) {
            adminService.updatePassword(account);
        }
        return Result.success();
    }

}
