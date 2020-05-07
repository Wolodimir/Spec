package com.Spec.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    private int healthPoint;
    private int itemLevel;


    public Pers() {
    }

    public Pers(int healthPoint, int itemLevel) {
        this.healthPoint = healthPoint;
        this.itemLevel = itemLevel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getItemLevel() {
        return itemLevel;
    }

    public void setItemLevel(int itemLevel) {
        this.itemLevel = itemLevel;
    }
}
