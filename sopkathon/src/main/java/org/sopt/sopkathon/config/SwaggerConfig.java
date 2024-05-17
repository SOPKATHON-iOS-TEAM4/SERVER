package org.sopt.sopkathon.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        Info info = new Info()
                .title("NOW SOPT SOPKATHON iOS TEAM4")
                .description("나솝 솝커톤 아요 대상은 우리 거! 불만 있으면 맞다이로 들어와 ㅋ")
                .version("v1");

        return new OpenAPI()
                .info(info);
    }
}
