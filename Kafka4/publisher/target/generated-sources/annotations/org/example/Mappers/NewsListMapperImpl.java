package org.example.Mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.example.Impl.DTO.NewsRequestTo;
import org.example.Impl.DTO.NewsResponseTo;
import org.example.Impl.Entity.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-27T20:11:04+0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class NewsListMapperImpl implements NewsListMapper {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public List<News> toNewsList(List<NewsRequestTo> list) {
        if ( list == null ) {
            return null;
        }

        List<News> list1 = new ArrayList<News>( list.size() );
        for ( NewsRequestTo newsRequestTo : list ) {
            list1.add( newsMapper.NewsRequestToToNews( newsRequestTo ) );
        }

        return list1;
    }

    @Override
    public List<NewsResponseTo> toNewsResponseList(List<News> list) {
        if ( list == null ) {
            return null;
        }

        List<NewsResponseTo> list1 = new ArrayList<NewsResponseTo>( list.size() );
        for ( News news : list ) {
            list1.add( newsMapper.NewsToNewsResponseTo( news ) );
        }

        return list1;
    }
}
