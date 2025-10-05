package com.example.javaredisbackend.model;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;


@RedisHash("User")
public class User implements Serializable
{
    @Id
    public String id;
    public String name;
    public String email;

    public String getid(){
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail()
    {
        this.email = email;
    }
}