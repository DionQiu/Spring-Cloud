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
public class WeatherResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	private Weather data;
	private Integer status;
	private String desc;

	
}
