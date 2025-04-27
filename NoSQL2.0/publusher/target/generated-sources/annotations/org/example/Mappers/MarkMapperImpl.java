package org.example.Mappers;

import javax.annotation.processing.Generated;
import org.example.Impl.DTO.MarkRequestTo;
import org.example.Impl.DTO.MarkResponseTo;
import org.example.Impl.Entity.Mark;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-19T20:46:32+0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class MarkMapperImpl implements MarkMapper {

    @Override
    public Mark MarkResposeToToMark(MarkResponseTo markResponseTo) {
        if ( markResponseTo == null ) {
            return null;
        }

        Mark mark = new Mark();

        mark.setId( markResponseTo.getId() );
        mark.setName( markResponseTo.getName() );

        return mark;
    }

    @Override
    public Mark MarkRequestToToMark(MarkRequestTo markRequestTo) {
        if ( markRequestTo == null ) {
            return null;
        }

        Mark mark = new Mark();

        mark.setId( markRequestTo.getId() );
        mark.setName( markRequestTo.getName() );

        return mark;
    }

    @Override
    public MarkResponseTo MarkToMarkResponseTo(Mark mark) {
        if ( mark == null ) {
            return null;
        }

        MarkResponseTo markResponseTo = new MarkResponseTo();

        markResponseTo.setId( mark.getId() );
        markResponseTo.setName( mark.getName() );

        return markResponseTo;
    }

    @Override
    public MarkRequestTo MarkToMarkRequestTo(Mark mark) {
        if ( mark == null ) {
            return null;
        }

        MarkRequestTo markRequestTo = new MarkRequestTo();

        markRequestTo.setId( mark.getId() );
        markRequestTo.setName( mark.getName() );

        return markRequestTo;
    }
}
