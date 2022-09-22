package tr.com.obss.jip.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import tr.com.obss.jip.dto.UserDto;
import tr.com.obss.jip.model.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(source= "profileImage", target= "pImage")
    UserDto mapTo(User user);

}
