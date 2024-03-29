## 队列的基本操作的时间复杂度分析

### 数组队列 `ArrayQueue<E>`

| 操作 | 函数名              | 时间复杂度        |
| --- |------------------|--------------|
| 入队 | void enqueue (E) | O(1) (均摊复杂度) |
| 出队 | E dequeue()      | O(n)         |
| 查看队首元素 | E front()        | O(1)         |
| 获取队列的大小 | int getSize()    | O(1)         |
| 判断队列是否为空 | boolean isEmpty() | O(1)         |

### 循环队列 `LoopQueue<E>`
| 操作 | 函数名              | 时间复杂度        |
| --- |------------------|--------------|
| 入队 | void enqueue (E) | O(1)         |
| 出队 | E dequeue()      | O(1)         |
| 查看队首元素 | E front()        | O(1)         |
| 获取队列的大小 | int getSize()    | O(1)         |
| 判断队列是否为空 | boolean isEmpty() | O(1)         |
