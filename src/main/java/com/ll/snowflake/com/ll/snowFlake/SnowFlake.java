package com.ll.snowflake.com.ll.snowFlake;


public class SnowFlake {
    private long machineId = 1;
    private long dataCenter = 1;


    public long getMachineId() {
        return machineId;
    }

    public void setMachineId(long machineId) {
        this.machineId = machineId;
    }

    public long getDataCenter() {
        return dataCenter;
    }

    public void setDataCenter(long dataCenter) {
        this.dataCenter = dataCenter;
    }
}
