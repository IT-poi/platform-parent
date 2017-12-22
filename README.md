# platform-parent
提取重复代码构成一个springboot的基础平台，将代码通过maven打包到仓库，然后在新项目中通过在pom中加入如下代码即可快速开始一个springboot项目：
```
<parent>
        <groupId>com.yinjk.web</groupId>
        <artifactId>platform-parent</artifactId>
        <version>1.2</version>
</parent>
<dependencies>
        <dependency>
            <groupId>com.yinjk.web</groupId>
            <artifactId>platform-core</artifactId>
            <version>1.2</version>
        </dependency>
</dependencies>
    
```
