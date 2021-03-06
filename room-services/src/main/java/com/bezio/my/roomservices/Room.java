package com.bezio.my.roomservices;

import javax.persistence.*;

@Entity
@Table(name = "ROOM")
public class Room {

    @Id
    @Column (name = "ROOM_ID", nullable = false)
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    @Column (name = "NAME")
    private String name;

    @Column (name = "ROOM_NUMBER", nullable = false)
    private String number;

    @Column (name = "BED_INFO")
    private String info;

    public long getId () {
        return id;
    }

    public void setId (long id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getNumber () {
        return number;
    }

    public void setNumber (String number) {
        this.number = number;
    }

    public String getInfo () {
        return info;
    }

    public void setInfo (String info) {
        this.info = info;
    }

}
