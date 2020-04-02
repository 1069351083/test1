package com.example.demo.userservice.impl;

import com.baomidou.mybatisplus.plugins.pagination.PageHelper;
import com.example.demo.domain.SysUser;

import com.example.demo.usermapper.SysUserMapper;
import com.example.demo.userservice.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ISysUserServiceImpl implements ISysUserService {
    @Autowired
    private SysUserMapper userMapper;


    @Override
    public List<SysUser> selectUserList() {
        return userMapper.selectUserList();
    }

}