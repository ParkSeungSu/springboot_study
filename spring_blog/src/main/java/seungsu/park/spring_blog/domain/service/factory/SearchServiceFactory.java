package seungsu.park.spring_blog.domain.service.factory;

import seungsu.park.spring_blog.domain.service.PostSearchService;

public interface SearchServiceFactory {
    PostSearchService getSearchService(String selector);
}
