package cn.lhzh.mqttstudy.bean;

import com.google.gson.annotations.SerializedName;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class IotData implements Serializable {

    @SerializedName("deviceid")
    String deviceid;//设备id

    @SerializedName("sensorid")
    String sensorid;//数据id

    @SerializedName("types")
    String types;//设备来源

    @SerializedName("loraid")
    String loraid;//loraid硬件的id

    @SerializedName("createtime")
    Date createtime;//创建时间

    @SerializedName("temp")
    float temp;//温度

    @SerializedName("humi")
    float humi;//湿度

    @SerializedName("light")
    float light;//光敏

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    public String getSensorid() {
        return sensorid;
    }

    public void setSensorid(String sensorid) {
        this.sensorid = sensorid;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getLoraid() {
        return loraid;
    }

    public void setLoraid(String loraid) {
        this.loraid = loraid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getHumi() {
        return humi;
    }

    public void setHumi(float humi) {
        this.humi = humi;
    }

    public float getLight() {
        return light;
    }

    public void setLight(float light) {
        this.light = light;
    }
}

