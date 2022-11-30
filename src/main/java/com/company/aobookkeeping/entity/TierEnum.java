package com.company.aobookkeeping.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum TierEnum implements EnumClass<Integer> {

    T1(1),
    T2(2),
    T3(3),
    T4(4),
    T5(5),
    T6(6),
    T7(7),
    T8(8);

    private Integer id;

    TierEnum(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static TierEnum fromId(Integer id) {
        for (TierEnum at : TierEnum.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}