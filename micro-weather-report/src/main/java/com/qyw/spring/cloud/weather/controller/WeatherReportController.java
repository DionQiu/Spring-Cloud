package com.qyw.spring.cloud.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.qyw.spring.cloud.weather.service.CityDataService;
import com.qyw.spring.cloud.weather.service.WeatherReportService;

@RestController
@RequestMapping("/report")
public class WeatherReportController {

	public static final String DEFAULT_CITY_ID="101280101";

	@Autowired
	private CityDataService cityDataService;
	
	@Autowired
	private WeatherReportService weatherReportService;
	
	@GetMapping(value = {"/cityId/","/cityId/{cityId}"})
	public ModelAndView getReportByCityId(@PathVariable(value="cityId",required = false) String cityId, Model model) throws Exception {
		if(StringUtils.isEmpty(cityId)){
			cityId=DEFAULT_CITY_ID;
		}

		model.addAttribute("title", "邱勇伟的天气预报");
		model.addAttribute("cityId", cityId);
		model.addAttribute("cityList", cityDataService.listCity());
		model.addAttribute("report", weatherReportService.getDataByCityId(cityId));
		return new ModelAndView("weather/report", "reportModel", model);
	}

}
