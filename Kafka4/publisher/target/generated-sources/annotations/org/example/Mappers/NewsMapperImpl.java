package org.example.Mappers;

import javax.annotation.processing.Generated;
import org.example.Impl.DTO.NewsRequestTo;
import org.example.Impl.DTO.NewsResponseTo;
import org.example.Impl.Entity.News;
import org.example.Impl.Entity.User;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-27T20:11:04+0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class NewsMapperImpl implements NewsMapper {

    @Override
    public NewsRequestTo NewsToNewsRequestTo(News news) {
        if ( news == null ) {
            return null;
        }

        NewsRequestTo newsRequestTo = new NewsRequestTo();

        newsRequestTo.setId( news.getId() );
        newsRequestTo.setTitle( news.getTitle() );
        newsRequestTo.setContent( news.getContent() );
        newsRequestTo.setCreated( news.getCreated() );
        newsRequestTo.setModified( news.getModified() );

        return newsRequestTo;
    }

    @Override
    public NewsResponseTo NewsToNewsResponseTo(News news) {
        if ( news == null ) {
            return null;
        }

        NewsResponseTo newsResponseTo = new NewsResponseTo();

        newsResponseTo.setUserId( newsUserId( news ) );
        newsResponseTo.setId( news.getId() );
        newsResponseTo.setTitle( news.getTitle() );
        newsResponseTo.setContent( news.getContent() );
        newsResponseTo.setCreated( news.getCreated() );
        newsResponseTo.setModified( news.getModified() );

        return newsResponseTo;
    }

    @Override
    public News NewsResponseToToNews(NewsResponseTo responseTo) {
        if ( responseTo == null ) {
            return null;
        }

        News news = new News();

        news.setId( responseTo.getId() );
        news.setTitle( responseTo.getTitle() );
        news.setContent( responseTo.getContent() );
        news.setCreated( responseTo.getCreated() );
        news.setModified( responseTo.getModified() );

        return news;
    }

    @Override
    public News NewsRequestToToNews(NewsRequestTo requestTo) {
        if ( requestTo == null ) {
            return null;
        }

        News news = new News();

        news.setUser( newsRequestToToUser( requestTo ) );
        news.setId( requestTo.getId() );
        news.setTitle( requestTo.getTitle() );
        news.setContent( requestTo.getContent() );
        news.setCreated( requestTo.getCreated() );
        news.setModified( requestTo.getModified() );

        return news;
    }

    private long newsUserId(News news) {
        User user = news.getUser();
        if ( user == null ) {
            return 0L;
        }
        return user.getId();
    }

    protected User newsRequestToToUser(NewsRequestTo newsRequestTo) {
        if ( newsRequestTo == null ) {
            return null;
        }

        User user = new User();

        user.setId( newsRequestTo.getUserId() );

        return user;
    }
}
