//
//package trieu.metech.com;
//
//import java.io.IOException;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.util.StringUtils;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import lombok.extern.slf4j.Slf4j;
//import trieu.metech.com.service.UserService;
//@Slf4j
//public class JwtAuthenticationFilter extends OncePerRequestFilter {
//	@Autowired
//	private UserService customUserDetailsService;
//	@Autowired 
//	JwtTokenpr tokenProvider;
//	private String getJwtFromRequest(HttpServletRequest request) {
//		String bearerToken = request.getHeader("Authorization");
//		// Kiểm tra xem header Authorization có chứa thông tin jwt không
//		if (StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer")) {
//			return bearerToken.substring(7);
//		}
//		return null;
//	}
//
//	@Override
//	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//			throws ServletException, IOException {
//		try {
//			String jwt = getJwtFromRequest(request);
//			 if (StringUtils.hasText(jwt) 
////					 && 
////					 tokenProvider.validateToken(jwt)
//					 ) {
//	                // Lấy id user từ chuỗi jwt
//	                Long userId = tokenProvider.getUserIdFromJWT(jwt);
//	                // Lấy thông tin người dùng từ id
//	                UserDetail userDetails = customUserDetailsService.loadUserById(userId);
//	                if(userDetails != null) {
//	                    // Nếu người dùng hợp lệ, set thông tin cho Seturity Context
//	                    UsernamePasswordAuthenticationToken
//	                            authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
//	                    authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//
//	                    SecurityContextHolder.getContext().setAuthentication(authentication);
//	                }
//	            }
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
//}
