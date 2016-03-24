package net.vindgy.groovy.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Vincent on 21/03/2016.
 */

@Embeddable
public class ParameterColumnPK implements Serializable {
    @Column(name="param_id", insertable=false, updatable=false, unique=true, nullable=false)
    protected Integer paramId;
    @Column(name="col_id", insertable=false, updatable=false, unique=true, nullable=false)
    protected Integer colId;
    public ParameterColumnPK() {}
    public ParameterColumnPK(Integer paramId, Integer colId) {
        this.paramId = paramId;
        this.colId = colId;
    }

    public Integer getParamId() {
        return paramId;
    }

    public void setParamId(Integer paramId) {
        this.paramId = paramId;
    }

    public Integer getColId() {
        return colId;
    }

    public void setColId(Integer colId) {
        this.colId = colId;
    }

    @Override
    public String toString() {
        return "ParameterColumnPK{" +
                "paramId=" + paramId +
                ", colId=" + colId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParameterColumnPK that = (ParameterColumnPK) o;

        if (!paramId.equals(that.paramId)) return false;
        return colId.equals(that.colId);

    }

    @Override
    public int hashCode() {
        int result = paramId.hashCode();
        result = 31 * result + colId.hashCode();
        return result;
    }
}
