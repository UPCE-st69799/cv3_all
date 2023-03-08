package cz.upce.fei.cv01.graphql;

import cz.upce.fei.cv01.dto.AppUserInputDto;
import cz.upce.fei.cv01.repository.AppUserRepository;
import cz.upce.fei.cv01.service.AppUserService;
import lombok.AllArgsConstructor;
import net.bytebuddy.asm.Advice;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class AppUserQLController {
    private final AppUserService appUserService;
    @QueryMapping
    public AppUserRepository appUser(@Argument final long id){
        return appUserService.finById(id).toDto();
    }
}
