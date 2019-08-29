package cn.yaya.pojo;

import java.io.Serializable;

public class User implements Serializable {
    /**
     * idint(11) NOT NULL
     * unamevarchar(32) NOT NULL
     * upasswordvarchar(32) NOT NULL
     */
    private Integer id;
    private String uname;
    private String upassword;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", upassword='" + upassword + '\'' +
                '}';
    }
}
