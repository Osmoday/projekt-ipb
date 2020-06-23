package com.ipb.projekt.entites;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "GPU", schema = "mas")
public class GpuEntity {
    private int idGpu;
    private Integer slots;
    private Integer streamingProcessors;
    private String clockspeed;

    @Id
    @Column(name = "IdGPU")
    public int getIdGpu() {
        return idGpu;
    }

    public void setIdGpu(int idGpu) {
        this.idGpu = idGpu;
    }

    @Basic
    @Column(name = "Slots")
    public Integer getSlots() {
        return slots;
    }

    public void setSlots(Integer slots) {
        this.slots = slots;
    }

    @Basic
    @Column(name = "StreamingProcessors")
    public Integer getStreamingProcessors() {
        return streamingProcessors;
    }

    public void setStreamingProcessors(Integer streamingProcessors) {
        this.streamingProcessors = streamingProcessors;
    }

    @Basic
    @Column(name = "Clockspeed")
    public String getClockspeed() {
        return clockspeed;
    }

    public void setClockspeed(String clockspeed) {
        this.clockspeed = clockspeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GpuEntity gpuEntity = (GpuEntity) o;
        return idGpu == gpuEntity.idGpu &&
                Objects.equals(slots, gpuEntity.slots) &&
                Objects.equals(streamingProcessors, gpuEntity.streamingProcessors) &&
                Objects.equals(clockspeed, gpuEntity.clockspeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGpu, slots, streamingProcessors, clockspeed);
    }
}
