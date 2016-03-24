package net.vindgy.groovy.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "rclpac")
public class ParameterColumn implements Serializable {

    @EmbeddedId
    private ParameterColumnPK id;

    @Basic
    @Column(name = "col_desc")
    String colDescription;

    @Basic
    @Column(name = "col_label")
    String colLabel;

    public ParameterColumn() {
    }

    public ParameterColumnPK getId() {
        return id;
    }

    public void setId(ParameterColumnPK id) {
        this.id = id;
    }

    public String getColDescription() {
        return colDescription;
    }

    public void setColDescription(String colDescription) {
        this.colDescription = colDescription;
    }

    public String getColLabel() {
        return colLabel;
    }

    public void setColLabel(String colLabel) {
        this.colLabel = colLabel;
    }

    @Override
    public String toString() {
        return "ParameterColumn{" +
                "id=" + id +
                ", colDescription='" + colDescription + '\'' +
                ", colLabel='" + colLabel + '\'' +
                '}';
    }
}
