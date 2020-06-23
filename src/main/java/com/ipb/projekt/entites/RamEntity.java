package com.ipb.projekt.entites;

import javax.persistence.*;
import java.util.Objects;

@Entity
@DiscriminatorValue("ram")
public class RamEntity extends ProductEntity{
    private Integer dice;
    private String clockspeed;
    private String dieCapacity;

    @Basic
    @Column(name = "dice")
    public Integer getDice() {
        return dice;
    }

    public void setDice(Integer dice) {
        this.dice = dice;
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
    @Column(name = "die_capacity")
    public String getDieCapacity() {
        return dieCapacity;
    }

    public void setDieCapacity(String dieCapacity) {
        this.dieCapacity = dieCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dice, clockspeed, dieCapacity);
    }
}
