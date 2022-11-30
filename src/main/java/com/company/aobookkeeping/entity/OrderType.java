package com.company.aobookkeeping.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum OrderType implements EnumClass<Integer> {

    BUY(1),
    SELL(2);

    private Integer id;

    OrderType(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static OrderType fromId(Integer id) {
        for (OrderType at : OrderType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}