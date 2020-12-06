package com.pedrombcampos.auth.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class UserVO implements Serializable {

	private static final long serialVersionUID = 5295824543067781985L;
	
	private String userName;	
	private String password;

}
