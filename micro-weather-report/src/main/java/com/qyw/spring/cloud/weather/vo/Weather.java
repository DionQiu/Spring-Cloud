package com.qyw.spring.cloud.weather.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Weather implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String city;
	private String aqi;
	private String ganmao;
	private String wendu;
	private Yeaterday yesterday;
	private List<Forecast> forecast;


}
