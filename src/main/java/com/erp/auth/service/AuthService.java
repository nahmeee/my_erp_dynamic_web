/**
 * 
 */
package com.erp.auth.service;

import com.erp.auth.vo.AuthDTOs.RegisterRequestDTO;
import com.erp.common.rest.RestResponse;

/**
 * Description : 클래스에 대한 설명을 입력해주세요.<br>
 * Date : 2024. 12. 26.<br>
 * History :<br>
 * - 작성자 : Kosta, 날짜 : 2024. 12. 26., 설명 : 최초작성<br>
 *
 * @author Kosta
 * @version 1.0
 */
public interface AuthService {
	void register(RegisterRequestDTO dto);
}
