package com.xzxy.lewy.allatori.pojo;

import java.io.Serializable;

/**
 * 2.8 家族史
 */
public class JzsReport implements Serializable {

    private String sjid;
    private String yljgdm;  // 医疗机构代码
    private String jzlsh;  // 就诊流水号
    private String mzzybz;  // 门诊/住院标志
    private String jzs;  // 家族史
    private String djsj;  // 登记时间

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

    public String getJzlsh() {
        return jzlsh;
    }

    public void setJzlsh(String jzlsh) {
        this.jzlsh = jzlsh;
    }

    public String getMzzybz() {
        return mzzybz;
    }

    public void setMzzybz(String mzzybz) {
        this.mzzybz = mzzybz;
    }

    public String getJzs() {
        return jzs;
    }

    public void setJzs(String jzs) {
        this.jzs = jzs;
    }

    public String getDjsj() {
        return djsj;
    }

    public void setDjsj(String djsj) {
        this.djsj = djsj;
    }
}
