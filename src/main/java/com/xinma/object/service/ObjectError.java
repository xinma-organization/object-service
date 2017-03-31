package com.xinma.object.service;

import com.xinma.base.core.error.CustomError;

/**
 * Object存储错误代码定义
 * 
 * @author Alauda
 *
 * @date 2015年6月29日
 *
 */
public enum ObjectError implements CustomError {

	Unknown("datastore-object-001", "unknown excption when access object storage."),

	CreateForderErr("datastore-object-002", "create folder error."),

	IOExceptionErr("datastore-object-003", "IOException error when upload object.");

	String value;

	String description;

	ObjectError(String value, String description) {
		this.value = value;
		this.description = description;
	}

	@Override
	public String value() {
		return value;
	}

	@Override
	public String description() {
		return description;
	}

}
