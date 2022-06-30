package com.kentoes.basic.models.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "munit")
public class MUnit implements Serializable {
    @Id
    private String unit;
    private String Name;
}
