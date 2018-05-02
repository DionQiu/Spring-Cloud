package com.qyw.spring.cloud.weather.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Forecast implements Serializable {

	private static final long serialVersionUID = 1L;
	private String date;
	private String high;
	private String fengli;
	private String low;
	private String fengxiang;
	private String type;


}
