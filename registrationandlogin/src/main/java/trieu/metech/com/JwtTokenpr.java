//package trieu.metech.com;
//
//import java.util.Date;
//
//import org.springframework.stereotype.Component;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.MalformedJwtException;
//import io.jsonwebtoken.SignatureAlgorithm;
//import lombok.extern.slf4j.Slf4j;
//import trieu.metech.com.entity.CustomUserDetail;
//import org.slf4j.Logger;
//
//@Component
//@Slf4j
//public class JwtTokenpr {
//	private final String JWT_SECRET = "lodaaaa";
//	private final Long JWT_EXPIRATION = 600000L;
//
//	public String generateToken(CustomUserDetail userDetails) {
//		Date now = new Date();
//		Date expiryDate = new Date(now.getTime() + JWT_EXPIRATION);
//		return Jwts.builder().setSubject(Long.toString(userDetails.getUser().getId())).setIssuedAt(now)
//				.setExpiration(expiryDate).signWith(SignatureAlgorithm.HS512, JWT_SECRET).compact();
//	}
//
//	public Long getUserIdFromJWT(String token) {
//		Claims claims = Jwts.parser().setSigningKey(JWT_SECRET).parseClaimsJws(token).getBody();
//
//		return Long.parseLong(claims.getSubject());
//	}
//
////	public boolean validateToken(String authToken) {
////		try {
////			Jwts.parser().setSigningKey(JWT_SECRET).parseClaimsJws(authToken);
////			return true;
////		} catch (MalformedJwtException ex) {
////			Log.error("Invalid JWT token");
////		} 
////		return false;
////	}
//}
