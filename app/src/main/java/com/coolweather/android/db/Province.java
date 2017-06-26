package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/6/15.
 * 存放省数据
 */
public class Province extends DataSupport {
    private int id;
    private String provinceName; //记录省的名字
    private int provinceCode;    //记录省的代号
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
        //记录省的名字
    public String getProvinceName(){
        return provinceName;
    }

    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }
        //记录省的代号
    public int getProvinceCode(){
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
}
