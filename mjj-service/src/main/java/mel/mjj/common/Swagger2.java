package mel.mjj.common;

/**
 * @Api： 描述 Controller
 * @ApiIgnore： 忽略该 Controller，指不对当前类做扫描
 * @ApiOperation： 描述 Controller类中的 method接口
 * @ApiParam： 单个参数描述，与 @ApiImplicitParam不同的是，他是写在参数左侧的。如（ @ApiParam(name="username",value="用户名")Stringusername）
 * @ApiModel： 描述 POJO对象
 * @ApiProperty： 描述 POJO对象中的属性值
 * @ApiImplicitParam： 描述单个入参信息
 * @ApiImplicitParams： 描述多个入参信息
 * @ApiResponse： 描述单个出参信息
 * @ApiResponses： 描述多个出参信息
 * @ApiError： 接口错误所返回的信息
 */
//@Configuration
//@EnableSwagger2
//public class Swagger2 {
//    @Bean
//    public Docket createRestApi(){
//        return new Docket(DocumentationType.SWAGGER_2).
//                apiInfo(apiInfo()).
//                select().
//                apis(RequestHandlerSelectors.withClassAnnotation(Api.class)).
//                paths(PathSelectors.any()).
//                build();
//    }
//    private ApiInfo apiInfo(){
//        return new ApiInfoBuilder()
//                .title("摩经纪接口文档")
//                .description("摩经纪")
////                .termsOfServiceUrl("sss")
//                .version("0.1")
//                .build();
//    }
//}
