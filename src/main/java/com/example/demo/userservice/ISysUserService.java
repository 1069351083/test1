package com.example.demo.userservice;

import com.example.demo.domain.SysUser;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户 业务层
 * 
 * @author ruoyi
 */
public interface ISysUserService
{

    public List<SysUser> selectUserList();

    /**

     */
}
