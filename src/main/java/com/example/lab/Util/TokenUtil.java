package com.example.lab.Util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.example.lab.Entity.User;
import com.sun.javafx.scene.traversal.Direction;
import com.sun.javafx.scene.traversal.TraversalContext;
import javafx.scene.Node;
import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties;

import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class TokenUtil {
	private final static Long EXPIRE = 24*60*60*1000L;
	private final static String TOKEN_SECRETE = "labManager";

	/**
	 * 生成token
	 * @param user
	 * @return
	 */
	public static String generateToken(User user){
		try{
			// 过期时间
			Date date = new Date(System.currentTimeMillis() + EXPIRE);
			// 私钥和加密算法
			Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRETE);
			// 设置头部信息
			Map<String, Object> header = new ConcurrentHashMap<>();
			header.put("Type", "jwt");
			header.put("alg", "HMAC256");
			// JWT字符串
			return JWT.create()
					.withHeader(header)
					.withClaim("userId", user.getUserId())
					.withExpiresAt(date)
					.sign(algorithm);
		}catch (Exception e){
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 解析token
	 * @param token
	 * @return
	 */
	public  static String getInfoByToken(String token){
		try{
			Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRETE);
			JWTVerifier verifier = JWT.require(algorithm).build();
			DecodedJWT jwt = verifier.verify(token);
			String userId = jwt.getClaim("userId").asString();
			return userId;
		}catch (Exception e){
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 首先在缓存中找token是否存在 然后直接通过token拿到userId（也可以在缓存拿到全部用户全部）
	 * @param token
	 * @return
	 */
	public static boolean isPass(String token){
		String userId = null;
		if(CacheManagerUtil.isContains(token)){
			userId = TokenUtil.getInfoByToken(token);
		}
		if(Objects.isNull(userId)) return false;
		return true;
	}

}
