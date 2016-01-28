package com.cniao5.entity;

import java.util.List;

public class FindAdData {
	private String code;
	private List<FindAdBean> data;

	public FindAdData() {
		super();
	}

	public FindAdData(String code, List<FindAdBean> data) {
		super();
		this.code = code;
		this.data = data;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<FindAdBean> getData() {
		return data;
	}

	public void setData(List<FindAdBean> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "FindAdData [code=" + code + ", data=" + data + "]";
	}

}
