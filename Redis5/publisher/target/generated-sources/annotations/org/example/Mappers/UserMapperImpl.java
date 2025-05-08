package org.example.Mappers;

import javax.annotation.processing.Generated;
import org.example.Impl.DTO.UserRequestTo;
import org.example.Impl.DTO.UserResponseTo;
import org.example.Impl.Entity.User;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-19T20:46:33+0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserResponseTo UserToUserResponseTo(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponseTo userResponseTo = new UserResponseTo();

        userResponseTo.setId( user.getId() );
        userResponseTo.setLogin( user.getLogin() );
        userResponseTo.setPassword( user.getPassword() );
        userResponseTo.setFirstname( user.getFirstname() );
        userResponseTo.setLastname( user.getLastname() );

        return userResponseTo;
    }

    @Override
    public UserRequestTo UserToUserRequestTo(User user) {
        if ( user == null ) {
            return null;
        }

        UserRequestTo userRequestTo = new UserRequestTo();

        userRequestTo.setId( user.getId() );
        userRequestTo.setLogin( user.getLogin() );
        userRequestTo.setPassword( user.getPassword() );
        userRequestTo.setFirstname( user.getFirstname() );
        userRequestTo.setLastname( user.getLastname() );

        return userRequestTo;
    }

    @Override
    public User UserResponseToToUser(UserResponseTo userResponseTo) {
        if ( userResponseTo == null ) {
            return null;
        }

        User user = new User();

        user.setId( userResponseTo.getId() );
        user.setLogin( userResponseTo.getLogin() );
        user.setPassword( userResponseTo.getPassword() );
        user.setFirstname( userResponseTo.getFirstname() );
        user.setLastname( userResponseTo.getLastname() );

        return user;
    }

    @Override
    public User UserRequestToToUser(UserRequestTo userRequestTo) {
        if ( userRequestTo == null ) {
            return null;
        }

        User user = new User();

        user.setId( userRequestTo.getId() );
        user.setLogin( userRequestTo.getLogin() );
        user.setPassword( userRequestTo.getPassword() );
        user.setFirstname( userRequestTo.getFirstname() );
        user.setLastname( userRequestTo.getLastname() );

        return user;
    }
}
