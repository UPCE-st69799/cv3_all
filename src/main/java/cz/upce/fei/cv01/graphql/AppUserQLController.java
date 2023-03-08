package cz.upce.fei.cv01.graphql;

import cz.upce.fei.cv01.domain.AppUser;
import cz.upce.fei.cv01.dto.AppUserDto;
import cz.upce.fei.cv01.service.AppUserService;
import cz.upce.fei.cv01.service.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class AppUserQLController {
    private final AppUserService appUserService;
    @QueryMapping
    public AppUserDto appUser(@Argument final long id) throws ResourceNotFoundException {
        return AppUser.toDto(appUserService.finById(id));
    }
}
