package org.seckill.entry;

import java.util.Date;

public class SuccessKilled {

    private long seckilledId;

    private long username;

    private short state;

    private Date createTime;




    //多对一
    private Seckill seckill;

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    public long getSeckilledId() {
        return seckilledId;
    }

    public void setSeckilledId(long seckilledId) {
        this.seckilledId = seckilledId;
    }

    public long getUsername() {
        return username;
    }

    public void setUsername(long username) {
        this.username = username;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SuccessKilled{" +
                "seckilledId=" + seckilledId +
                ", username=" + username +
                ", state=" + state +
                ", createTime=" + createTime +
                '}';
    }
}
