package net.vindgy.groovy.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "rclpab")
public class ParameterSet implements Serializable {

    @EmbeddedId
    private ParameterSetPK id;

    @Basic    @Column(name = "col01_val")    String col01Val;
    @Basic    @Column(name = "col02_val")    String col02Val;
    @Basic    @Column(name = "col03_val")    String col03Val;
    @Basic    @Column(name = "col04_val")    String col04Val;
    @Basic    @Column(name = "col05_val")    String col05Val;
    @Basic    @Column(name = "col06_val")    String col06Val;
    @Basic    @Column(name = "col07_val")    String col07Val;
    @Basic    @Column(name = "col08_val")    String col08Val;
    @Basic    @Column(name = "col09_val")    String col09Val;
    @Basic    @Column(name = "col10_val")    String col10Val;
    @Basic    @Column(name = "col11_val")    String col11Val;
    @Basic    @Column(name = "col12_val")    String col12Val;
    @Basic    @Column(name = "col13_val")    String col13Val;
    @Basic    @Column(name = "col14_val")    String col14Val;
    @Basic    @Column(name = "col15_val")    String col15Val;

    public ParameterSet() {
    }

    public ParameterSetPK getId() {
        return id;
    }

    public void setId(ParameterSetPK id) {
        this.id = id;
    }

    public String getCol01Val() {
        return col01Val;
    }

    public void setCol01Val(String col01Val) {
        this.col01Val = col01Val;
    }

    public String getCol02Val() {
        return col02Val;
    }

    public void setCol02Val(String col02Val) {
        this.col02Val = col02Val;
    }

    public String getCol03Val() {
        return col03Val;
    }

    public void setCol03Val(String col03Val) {
        this.col03Val = col03Val;
    }

    public String getCol04Val() {
        return col04Val;
    }

    public void setCol04Val(String col04Val) {
        this.col04Val = col04Val;
    }

    public String getCol05Val() {
        return col05Val;
    }

    public void setCol05Val(String col05Val) {
        this.col05Val = col05Val;
    }

    public String getCol06Val() {
        return col06Val;
    }

    public void setCol06Val(String col06Val) {
        this.col06Val = col06Val;
    }

    public String getCol07Val() {
        return col07Val;
    }

    public void setCol07Val(String col07Val) {
        this.col07Val = col07Val;
    }

    public String getCol08Val() {
        return col08Val;
    }

    public void setCol08Val(String col08Val) {
        this.col08Val = col08Val;
    }

    public String getCol09Val() {
        return col09Val;
    }

    public void setCol09Val(String col09Val) {
        this.col09Val = col09Val;
    }

    public String getCol10Val() {
        return col10Val;
    }

    public void setCol10Val(String col10Val) {
        this.col10Val = col10Val;
    }

    public String getCol11Val() {
        return col11Val;
    }

    public void setCol11Val(String col11Val) {
        this.col11Val = col11Val;
    }

    public String getCol12Val() {
        return col12Val;
    }

    public void setCol12Val(String col12Val) {
        this.col12Val = col12Val;
    }

    public String getCol13Val() {
        return col13Val;
    }

    public void setCol13Val(String col13Val) {
        this.col13Val = col13Val;
    }

    public String getCol14Val() {
        return col14Val;
    }

    public void setCol14Val(String col14Val) {
        this.col14Val = col14Val;
    }

    public String getCol15Val() {
        return col15Val;
    }

    public void setCol15Val(String col15Val) {
        this.col15Val = col15Val;
    }

    @Override
    public String toString() {
        return "ParameterSet{" +
                "id=" + id +
                ", col01Val='" + col01Val + '\'' +
                ", col02Val='" + col02Val + '\'' +
                ", col03Val='" + col03Val + '\'' +
                ", col04Val='" + col04Val + '\'' +
                ", col05Val='" + col05Val + '\'' +
                ", col06Val='" + col06Val + '\'' +
                ", col07Val='" + col07Val + '\'' +
                ", col08Val='" + col08Val + '\'' +
                ", col09Val='" + col09Val + '\'' +
                ", col10Val='" + col10Val + '\'' +
                ", col11Val='" + col11Val + '\'' +
                ", col12Val='" + col12Val + '\'' +
                ", col13Val='" + col13Val + '\'' +
                ", col14Val='" + col14Val + '\'' +
                ", col15Val='" + col15Val + '\'' +
                '}';
    }
}
