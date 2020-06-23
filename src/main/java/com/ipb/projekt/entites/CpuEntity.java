package com.ipb.projekt.entites;

import javax.persistence.*;
import java.util.Objects;

@Entity
@DiscriminatorValue("cpu")
public class CpuEntity extends ProductEntity{
    private Integer cores;
    private String clockspeed;
    private String turboclock;

    @Basic
    @Column(name = "cores")
    public Integer getCores() {
        return cores;
    }

    public void setCores(Integer cores) {
        this.cores = cores;
    }

    @Basic
    @Column(name = "clockspeed")
    public String getClockspeed() {
        return clockspeed;
    }

    public void setClockspeed(String clockspeed) {
        this.clockspeed = clockspeed;
    }

    @Basic
    @Column(name = "turboclock")
    public String getTurboclock() {
        return turboclock;
    }

    public void setTurboclock(String turboclock) {
        this.turboclock = turboclock;
    }


    @Override
    public int hashCode() {
        return Objects.hash(cores, clockspeed, turboclock);
    }
}
