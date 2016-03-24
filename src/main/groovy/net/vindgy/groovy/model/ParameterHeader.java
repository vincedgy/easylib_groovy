package net.vindgy.groovy.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "rclpah")
public class ParameterHeader implements Serializable {

    @EmbeddedId
    private ParameterHeaderPK id;

    @Basic
    @Column(name = "flag_gen")
    private String flagGen;

    @Basic
    @Column(name = "lst_usrid")
    private String user;

    @Temporal(TemporalType.DATE)
    @Column(name = "lst_dt")
    private Date lastUpdate;

    @Column(name="param_desc")
    private String description;

    public ParameterHeader() {
    }

    public ParameterHeaderPK getId() {
        return id;
    }

    public void setId(ParameterHeaderPK id) {
        this.id = id;
    }

    public String getFlagGen() {
        return flagGen;
    }

    public void setFlagGen(String flagGen) {
        this.flagGen = flagGen;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ParameterHeader{" +
                "id=" + id +
                ", flagGen='" + flagGen + '\'' +
                ", user='" + user + '\'' +
                ", lastUpdate=" + lastUpdate +
                ", description='" + description + '\'' +
                '}';
    }
}
