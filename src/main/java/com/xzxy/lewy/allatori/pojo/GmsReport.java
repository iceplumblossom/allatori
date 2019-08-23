package com.xzxy.lewy.allatori.pojo;

import java.io.Serializable;

/**
 * 2.7 过敏史
 */
public class GmsReport implements Serializable {

    private String bgid;
    private String sjid;
    private String yljgdm;  // 医疗机构代码
    private String blfyjllsh;  // 不良反应记录流水号
    private String mzzybz;  // 门诊/住院标志
    private String gmlb;  // 过敏类别
    private String gmybm;  // 过敏原编码
    private String gmymc;  // 过敏原名称
    private String yzcd;  // 严重程度
    private String djsj;  // 登记时间

    public String getBgid() {
        return bgid;
    }

    public void setBgid(String bgid) {
        this.bgid = bgid;
    }

    public String getSjid() {
        return sjid;
    }

    public void setSjid(String sjid) {
        this.sjid = sjid;
    }

    public String getYljgdm() {
        return yljgdm;
    }

    public void setYljgdm(String yljgdm) {
        this.yljgdm = yljgdm;
    }

    public String getBlfyjllsh() {
        return blfyjllsh;
    }

    public void setBlfyjllsh(String blfyjllsh) {
        this.blfyjllsh = blfyjllsh;
    }

    public String getMzzybz() {
        return mzzybz;
    }

    public void setMzzybz(String mzzybz) {
        this.mzzybz = mzzybz;
    }

    public String getGmlb() {
        return gmlb;
    }

    public void setGmlb(String gmlb) {
        this.gmlb = gmlb;
    }

    public String getGmybm() {
        return gmybm;
    }

    public void setGmybm(String gmybm) {
        this.gmybm = gmybm;
    }

    public String getGmymc() {
        return gmymc;
    }

    public void setGmymc(String gmymc) {
        this.gmymc = gmymc;
    }

    public String getYzcd() {
        return yzcd;
    }

    public void setYzcd(String yzcd) {
        this.yzcd = yzcd;
    }

    public String getDjsj() {
        return djsj;
    }

    public void setDjsj(String djsj) {
        this.djsj = djsj;
    }
}
