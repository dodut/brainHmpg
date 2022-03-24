package co.kr.brain21c.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class message {
	String message = "";
	String href = "";
	
	public message(String message, String href) {
		this.message = message;
		this.href = href;
	}
}
