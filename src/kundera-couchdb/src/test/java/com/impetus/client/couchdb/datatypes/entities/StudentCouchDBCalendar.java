package com.impetus.client.couchdb.datatypes.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.impetus.kundera.index.Index;
import com.impetus.kundera.index.IndexCollection;

@Entity
@Table(name = "StudentOracleNoSQLCalendar", schema = "couchdatabase@couchdb_pu")
@IndexCollection(columns = { @Index(name = "name"), @Index(name = "age") })
public class StudentCouchDBCalendar
{

    @Id
    private Calendar id;

    @Column(name = "AGE")
    private short age;

    @Column(name = "NAME")
    private String name;

    /**
     * @return the id
     */
    public Calendar getId()
    {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(Calendar id)
    {
        this.id = id;
    }

    /**
     * @return the age
     */
    public short getAge()
    {
        return age;
    }

    /**
     * @param age
     *            the age to set
     */
    public void setAge(short age)
    {
        this.age = age;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

}
