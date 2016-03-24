package net.vindgy.groovy.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Vincent on 21/03/2016.
 */

@Embeddable
public class ParameterHeaderPK implements Serializable {
    @Column(name="param_id", insertable=false, updatable=false, unique=true, nullable=false)
    protected Integer paramId;

    public ParameterHeaderPK() {}
    public ParameterHeaderPK(Integer paramId) {
        this.paramId = paramId;

    }

    public Integer getParamId() {
        return paramId;
    }

    public void setParamId(Integer paramId) {
        this.paramId = paramId;
    }

    @Override
    public String toString() {
        return "ParameterSetPK{" +
                "paramId=" + paramId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParameterHeaderPK that = (ParameterHeaderPK) o;

        return paramId.equals(that.paramId);

    }

    @Override
    public int hashCode() {
        return paramId.hashCode();
    }
}
