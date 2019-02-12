package com.sqp.springcloud.entities;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Department implements Serializable
{
	private Integer id;
	private String deptName;
	private String dbSource;

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getDeptName()
	{
		return deptName;
	}

	public void setDeptName(String deptName)
	{
		this.deptName = deptName;
	}

	public String getDbSource()
	{
		return dbSource;
	}

	public void setDbSource(String dbSource)
	{
		this.dbSource = dbSource;
	}

	public Department()
	{
		super();
	}

	public Department(Integer id, String deptName, String dbSource)
	{
		super();
		this.id = id;
		this.deptName = deptName;
		this.dbSource = dbSource;
	}

	@Override
	public String toString()
	{
		return "Department [id=" + id + ", deptName=" + deptName + ", dbSource=" + dbSource + "]";
	}

}
