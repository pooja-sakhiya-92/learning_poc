package com.freemind.creativeservices.filtering;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {

    
    @Autowired
    BeanPropertyFilter beanPropertyFilter;
    
    @GetMapping("/filtering")
    public MappingJacksonValue retriveFilterBean(){
        FilterBean filterBean = new FilterBean("name:pooja", "123");
        MappingJacksonValue mappingJacksonValue = beanPropertyFilter.filterProperties(filterBean);
        return mappingJacksonValue;
    }
}
