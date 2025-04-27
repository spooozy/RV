package org.example.Mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.example.Impl.DTO.UserRequestTo;
import org.example.Impl.DTO.UserResponseTo;
import org.example.Impl.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-27T20:11:04+0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class UserListMapperImpl implements UserListMapper {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> toUserList(List<UserRequestTo> users) {
        if ( users == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( users.size() );
        for ( UserRequestTo userRequestTo : users ) {
            list.add( userMapper.UserRequestToToUser( userRequestTo ) );
        }

        return list;
    }

    @Override
    public List<UserResponseTo> toUserResponseList(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserResponseTo> list = new ArrayList<UserResponseTo>( users.size() );
        for ( User user : users ) {
            list.add( userMapper.UserToUserResponseTo( user ) );
        }

        return list;
    }
}
