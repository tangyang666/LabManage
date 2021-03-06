package com.xbn.pojo;

public class UserInfoPojo {
    private int id;
    private String username;
    private String password;
    private String userType;
    private String email;
    private String mobile;
    private String name;
    private String leaderUsername;
    private String userId;
    private int labId;
    private String verify;


    @Override
    public String toString() {
        return "UserInfoPojo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userType='" + userType + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", name='" + name + '\'' +
                ", leaderUsername='" + leaderUsername + '\'' +
                ", userId='" + userId + '\'' +
                ", labId=" + labId +
                ", verify='" + verify + '\'' +
                '}';
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeaderUsername() {
        return leaderUsername;
    }

    public void setLeaderUsername(String leaderUsername) {
        this.leaderUsername = leaderUsername;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getLabId() {
        return labId;
    }

    public void setLabId(int labId) {
        this.labId = labId;
    }
}
