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
public class Yeaterday implements Serializable {
	private static final long serialVersionUID = 1L;
	private String date;
	private String high;
	private String fx;
	private String low;
	private String fl;
	private String type;

}
