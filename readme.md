
####maven archetype 
* 方便创建spring boot项目
* archetype-spring-web 是spring boot +spring mvc组合
* archetype-spring-web 是spring boot + spring mvc+mybatis组合,
   默认配置的是mysql数据库
   
   
#### 源码编译安装
   * clone 项目
   * mvn install
   * cd archetype-spring-web
   * mvn archetype:create-frome-project 
   * cd archetype-spring-web/target/generated-sources/archetype
   * mvn install 
   默认会安装到 maven 本地库，用户/.m2/
   
   
   ###其他参考命令
#### archetype 安装命令

* mvn install:install-file -DgroupId=org.apache.maven.archetypes -DartifactId=maven-archetype-quickstart -Dversion=1.1 -Dpackaging=jar -Dfile=maven-archetype-quickstart-1.1.jar 