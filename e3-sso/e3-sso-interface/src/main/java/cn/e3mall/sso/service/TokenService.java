package cn.e3mall.sso.service;

import cn.e3mall.common.utils.E3Result;

/**
 * 根据token查询用户信息
 * <p>
 * Title: TokenService
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Company: www.itcast.cn
 * </p>
 * 
 * @version 1.0
 */
public interface TokenService {
	/**
	 * 更具token返回一个用户信息
	 * 
	 * @param token
	 *            用户的token信息（在redis中查，token为key，value为用户信息，查到则用户信息没过期，差不到则过期）
	 * @return 用户信息
	 */
	E3Result getUserByToken(String token);
}
