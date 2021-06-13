package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;	
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component	// 스프링에서 관리해야 하는 객체임을 명시.
@Data
public class Restaurant {
	
	// 레스토랑 객체는 쉐프 객체를 필요로 함.
	
	// onMethod_ :: setChef()에 @Autowired 어노테이션을 추가하도록 함.
	@Setter(onMethod_ =  @Autowired)
	private Chef chef;
	
}
