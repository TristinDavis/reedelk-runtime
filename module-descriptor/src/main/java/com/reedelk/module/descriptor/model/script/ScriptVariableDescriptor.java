package com.reedelk.module.descriptor.model.script;

import java.io.Serializable;

public class ScriptVariableDescriptor implements Serializable {

    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ScriptVariableDescriptor{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
