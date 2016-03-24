package net.vindgy.groovy.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Vincent on 21/03/2016.
 */

@Embeddable
public class ParameterSetPK implements Serializable {
    @Column(name="param_id", insertable=false, updatable=false, unique=true, nullable=false)
    protected Integer paramId;
    @Column(name="line_id", insertable=false, updatable=false, unique=true, nullable=false)
    protected Integer lineId;
    public ParameterSetPK() {}
    public ParameterSetPK(Integer paramId, Integer lineId) {
        this.paramId = paramId;
        this.lineId = lineId;
    }

    public Integer getParamId() {
        return paramId;
    }

    public void setParamId(Integer paramId) {
        this.paramId = paramId;
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    @Override
    public String toString() {
        return "ParameterSetPK{" +
                "paramId=" + paramId +
                ", lineId=" + lineId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParameterSetPK that = (ParameterSetPK) o;

        if (!paramId.equals(that.paramId)) return false;
        return lineId.equals(that.lineId);

    }

    @Override
    public int hashCode() {
        int result = paramId.hashCode();
        result = 31 * result + lineId.hashCode();
        return result;
    }
}
