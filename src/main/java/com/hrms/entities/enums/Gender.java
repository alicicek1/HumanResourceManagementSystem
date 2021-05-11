package com.hrms.entities.enums;

public enum Gender {
    MAN{
        @Override
        public byte getValue(){return 0;}
    },
    WOMAN{
        @Override
        public byte getValue(){return 1;}
    },
    NOT_MENTIONED{
        public byte getValue(){return 2;}
    };

    public abstract byte getValue();
}
