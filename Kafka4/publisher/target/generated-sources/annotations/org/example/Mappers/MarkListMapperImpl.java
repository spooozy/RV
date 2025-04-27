package org.example.Mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.example.Impl.DTO.MarkRequestTo;
import org.example.Impl.DTO.MarkResponseTo;
import org.example.Impl.Entity.Mark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-27T20:11:03+0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class MarkListMapperImpl implements MarkListMapper {

    @Autowired
    private MarkMapper markMapper;

    @Override
    public List<Mark> toMarkList(List<MarkRequestTo> list) {
        if ( list == null ) {
            return null;
        }

        List<Mark> list1 = new ArrayList<Mark>( list.size() );
        for ( MarkRequestTo markRequestTo : list ) {
            list1.add( markMapper.MarkRequestToToMark( markRequestTo ) );
        }

        return list1;
    }

    @Override
    public List<MarkResponseTo> toMarkResponseList(List<Mark> list) {
        if ( list == null ) {
            return null;
        }

        List<MarkResponseTo> list1 = new ArrayList<MarkResponseTo>( list.size() );
        for ( Mark mark : list ) {
            list1.add( markMapper.MarkToMarkResponseTo( mark ) );
        }

        return list1;
    }
}
