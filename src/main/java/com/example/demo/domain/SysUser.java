package com.example.demo.domain;

public class SysUser {
    private static final long serialVersionUID = 1L;
 public   Long userId;
  public String userNmae;
 public   String loginName;
  public String password;
  public Long   salt;
  public Long  status;
   public Long  deflag;
   public Long  sex;
    public Long[] roleIds;
    public SysUser(String userNmae) {
        this.userNmae = userNmae;
    }

    public SysUser(Long userId) {


        this.userId = userId;
    }

    public SysUser() {
    }

    public SysUser(Long userId, String userNmae, String loginName, String password, Long salt, Long status, Long deflag, Long sex, Long[] roleIds) {
        this.userId = userId;
        this.userNmae = userNmae;
        this.loginName = loginName;
        this.password = password;
        this.salt = salt;
        this.status = status;
        this.deflag = deflag;
        this.sex = sex;
        this.roleIds = roleIds;
    }

    public Long getUserId() {

        return userId;
    }
    public boolean isAdmin()
    {
        return isAdmin(this.userId);
    }

    public static boolean isAdmin(Long userId)
    {
        return userId != null && 1L == userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserNmae() {
        return userNmae;
    }

    public void setUserNmae(String userNmae) {
        this.userNmae = userNmae;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getSalt() {
        return salt;
    }

    public void setSalt(Long salt) {
        this.salt = salt;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getDeflag() {
        return deflag;
    }

    public void setDeflag(Long deflag) {
        this.deflag = deflag;
    }

    public Long getSex() {
        return sex;
    }

    public void setSex(Long sex) {
        this.sex = sex;
    }

    public Long[] getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(Long[] roleIds) {
        this.roleIds = roleIds;
    }


}
