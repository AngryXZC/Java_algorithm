## 算法整理
### 《算法第四版》中的一些算法整理|以及慕课网数据结构与算法课程的一些算法整理
1. 书上的例子由于有自己的标准输入和输出函数
2. 使用IDEA+gradle 这种的还不太会使用Gradle,所以目前先拿命令行跑
   1. jenv -versons 查看当前安装的jdk版本,以及现在使用的JDK版本
   2. jenv local 11.0设置当前目录JDK为11.0
   3. export CLASSPATH=<i>algs.jar的路径</i>
   4. 记得跑书上例子的时候不要声明package不然编译得加全包名
   5. 书上的例子： 
         ```shell
         java BinarySearch tinyW.txt < tinyT.txt
         ```
      改为
      ```shell
       java BinarySearch ../data/tinyW.txt < ../data/tinyT.txt
       ```
### 《慕课网算法的整理》