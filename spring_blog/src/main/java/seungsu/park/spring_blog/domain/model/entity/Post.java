package seungsu.park.spring_blog.domain.model.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.beans.BeanUtils;

import lombok.Getter;
import lombok.Setter;
import seungsu.park.spring_blog.domain.model.command.PostCommand;

@Getter
@Setter
@Entity
public class Post {
    @Id
	@GeneratedValue
	int id;

	String userId;
	String name;

	@Column(nullable = false)
	String title;

	String subtitle;

	@Lob
	String content;

	Date regDate;

	Date updateDate;

	private int categoryId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoryId", insertable = false, updatable = false)
	private Category category;

	@OneToMany(mappedBy = "post", fetch = FetchType.LAZY, cascade = { CascadeType.MERGE })
	private List<PostTag> postTagList;

	public Post(PostCommand postCommand) {
		BeanUtils.copyProperties(postCommand, this);
	}
	
}
