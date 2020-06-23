package com.ipb.projekt.entites;

import javax.persistence.*;
import java.util.Objects;

@Entity
@DiscriminatorValue("gpu")
public class GpuEntity extends ProductEntity{
    private Integer slots;
    private Integer streamingProcessors;
    private String clockspeed;

    @Basic
    @Column(name = "slots")
    public Integer getSlots() {
        return slots;
    }

    public void setSlots(Integer slots) {
        this.slots = slots;
    }

    @Basic
    @Column(name = "streaming_processors")
    public Integer getStreamingProcessors() {
        return streamingProcessors;
    }

    public void setStreamingProcessors(Integer streamingProcessors) {
        this.streamingProcessors = streamingProcessors;
    }

    @Basic
    @Column(name = "clockspeed")
    public String getClockspeed() {
        return clockspeed;
    }

    public void setClockspeed(String clockspeed) {
        this.clockspeed = clockspeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(slots, streamingProcessors, clockspeed);
    }
}
