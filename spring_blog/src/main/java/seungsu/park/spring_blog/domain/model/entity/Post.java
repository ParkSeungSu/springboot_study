package seungsu.park.spring_blog.domain.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Post {
    @Id
    @GeneratedValue
    int id;

    
    String title;
    
    @Column(length = 10000000)
    String content;

    Date regDate;

	String subtitle;
	
}
