package com.obs.model;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="H_NOTLAR")
@SequenceGenerator(name="idGenerator",allocationSize=1,initialValue=1,sequenceName="SQ_H_NOTLAR")
public class Note extends BaseEntity{

	
}
