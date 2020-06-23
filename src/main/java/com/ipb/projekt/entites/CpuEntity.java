package com.ipb.projekt.entites;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "CPU", schema = "mas")
public class CpuEntity {
    private int idCpu;
    private Integer cores;
    private String clockspeed;
    private String turboclock;

    @Id
    @Column(name = "idcpu")
    public int getIdCpu() {
        return idCpu;
    }

    public void setIdCpu(int idCpu) {
        this.idCpu = idCpu;
    }

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CpuEntity cpuEntity = (CpuEntity) o;
        return idCpu == cpuEntity.idCpu &&
                Objects.equals(cores, cpuEntity.cores) &&
                Objects.equals(clockspeed, cpuEntity.clockspeed) &&
                Objects.equals(turboclock, cpuEntity.turboclock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCpu, cores, clockspeed, turboclock);
    }
}
