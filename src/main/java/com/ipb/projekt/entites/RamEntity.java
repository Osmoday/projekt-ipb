package com.ipb.projekt.entites;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "RAM", schema = "mas")
public class RamEntity {
    private int idRam;
    private Integer dice;
    private String clockspeed;
    private String dieCapacity;

    @Id
    @Column(name = "IdRAM")
    public int getIdRam() {
        return idRam;
    }

    public void setIdRam(int idRam) {
        this.idRam = idRam;
    }

    @Basic
    @Column(name = "Dice")
    public Integer getDice() {
        return dice;
    }

    public void setDice(Integer dice) {
        this.dice = dice;
    }

    @Basic
    @Column(name = "Clockspeed")
    public String getClockspeed() {
        return clockspeed;
    }

    public void setClockspeed(String clockspeed) {
        this.clockspeed = clockspeed;
    }

    @Basic
    @Column(name = "DieCapacity")
    public String getDieCapacity() {
        return dieCapacity;
    }

    public void setDieCapacity(String dieCapacity) {
        this.dieCapacity = dieCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RamEntity ramEntity = (RamEntity) o;
        return idRam == ramEntity.idRam &&
                Objects.equals(dice, ramEntity.dice) &&
                Objects.equals(clockspeed, ramEntity.clockspeed) &&
                Objects.equals(dieCapacity, ramEntity.dieCapacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRam, dice, clockspeed, dieCapacity);
    }
}
