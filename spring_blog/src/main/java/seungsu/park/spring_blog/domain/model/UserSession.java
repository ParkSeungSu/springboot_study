package seungsu.park.spring_blog.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserSession {
    String providerUserId;
    String imageUrl;
    String displayName;
    
}
