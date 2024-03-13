# 算法整理
## 《算法第四版》中的一些算法整理|以及慕课网数据结构与算法课程的一些算法整理
1. 书上的例子由于有自己的标准输入和输出函数
2. 使用IDEA+gradle 这种的还不太会使用Gradle,所以目前先拿命令行跑
   1. jenv -versons 查看当前安装的jdk版本,以及现在使用的JDK版本
   2. jenv local 11.0设置当前目录JDK为11.0
   3.  设置环境变量
      ```shell
      export CLASSPATH=<i>algs.jar的路径</i>
      ```
   windows下
    ```shell
    $env:CLASSPATH="$CLASSPATH;D:\Algorithm\Java_algorithm\Java_algorithm\app\lib\algs4.jar"
    ```
   4. 记得跑书上例子的时候不要声明package不然编译得加全包名
   5. 书上的例子： 
       ```shell
       java BinarySearch tinyW.txt < tinyT.txt
       ```
    改为
    ```shell
     java BinarySearch ../data/tinyW.txt < ../data/tinyT.txt
     ```
     
## 《慕课网算法的整理》
### 排序算法
1. 选择排序
```java
    public static  <E extends Comparable<E>>void sort(E[] arr){
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j].compareTo(arr[minIndex])<0){
                    minIndex=j;
                }
            }
            swap(arr,i,minIndex);
        }
    }
```
时间复杂度
- 选择排序的时间复杂度是O(n^2)
2. 插入排序
```java
    public static <E extends Comparable<E>> void sort(E[] arr){
        int n=arr.length;
        for (int i = 1; i < n; i++) {
            E temp=arr[i];
            int j;
            for (j = i; j > 0&&arr[j-1].compareTo(temp)>0; j--) {
                arr[j]=arr[j-1];
            }
            arr[j]=temp;
        }
    }
```
时间复杂度
- 插入排序的时间复杂度是O(n^2)

### 插入排序和选择排序的区别
1. 选择排序是不稳定的排序算法，而插入排序是稳定的排序算法
2. 在有序的情况下，插入排序的时间复杂度是O(n),而选择排序的时间复杂度是O(n^2)
3. 选择排序是原地排序算法，而插入排序不是原地排序算法
4. 选择排序的交换次数是固定的，而插入排序的交换次数是变化的
### 插入排序和选择排序的相同处
1. 两者的循环不变量都是一样的：arr[0...i)是有序的，arr[i...n)是无序的
2. 两者的时间复杂度都是O(n^2)
3. 都是基于比较的算法