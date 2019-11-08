# 将最新的2.5.7dubbo整合springboot
# 说明
* 当前项目的dubbo整合部分由 alibaba的 [spring-boot-dubbo-starter](https://github.com/alibaba/spring-boot-starter-dubbo.git)项目借鉴而来：
* 基于alibaba的dubbo starter 改进版本为 [spring-boot-dubbo-starter](https://github.com/liuchengts/spring-boot-dubbo-starter)
* 依赖包 ：com.alibaba.dubbo 、spring-boot-starter-web 、spring-boot-starter-actuator
# 编译注意
* 需要先下载改进版本的 [spring-boot-dubbo-starter](https://github.com/liuchengts/spring-boot-dubbo-starter) 作为集成dubbo的starter
* dubbo-test ：使用示例
  * 先启动 provider  再启动 consumer
  * 访问 http://localhost:8082  ,出现index  表示调用成功
