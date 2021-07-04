package seungsu.park.spring_blog.domain.repository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;
import seungsu.park.spring_blog.domain.model.entity.Category;
import seungsu.park.spring_blog.infrastructure.dao.CategoryDao;

@Slf4j
@Repository
public class CategoryRepository {

	@Autowired
	private CategoryDao categoryDao;

	public Category getCategory(int categoryId) {

		Category category = categoryDao.getOne(categoryId);
		log.debug("category = {}", category);

		return category;
	}

	public List<Category> getCategoryList() {

		List<Category> categoryList = categoryDao.findAll();
		log.debug("categoryList = {}", categoryList);

		return categoryList;
	}

	public Map<Integer, String> getCategoryMap() {
		return getCategoryList().stream().collect(Collectors.toMap(Category::getId, Category::getName));
	}
}